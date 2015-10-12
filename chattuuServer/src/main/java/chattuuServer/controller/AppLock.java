package chattuuServer.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLock {

	 /**
     * Instancia un nuevo app lock.
     */
    private AppLock() {
    }

    /** El lock_file. */
    File lock_file = null;

    /** El lock. */
    FileLock lock = null;

    /** El lock_channel. */
    FileChannel lock_channel = null;

    /** El lock_stream. */
    FileOutputStream lock_stream = null;

    /**
     * Instancia un nuevo app lock.
     *
     * @param key Key unica de la aplicacion
     * @throws Exception La excepcion
     */
    private AppLock(String key) throws Exception {
            String tmp_dir = System.getProperty("java.io.tmpdir");
            if (!tmp_dir.endsWith(System.getProperty("file.separator"))) {
                    tmp_dir += System.getProperty("file.separator");
            }

            // Adquiere MD5
            try {
                    java.security.MessageDigest md = java.security.MessageDigest
                                    .getInstance("MD5");
                    md.reset();
                    String hash_text = new java.math.BigInteger(1, md.digest(key
                                    .getBytes())).toString(16);
                    // Hash string no tiene ceros iniciales
                    // Agregando ceros al inicio del hash string
                    while (hash_text.length() < 32) {
                            hash_text = "0" + hash_text;
                    }
                    lock_file = new File(tmp_dir + hash_text + ".app_lock");
            } catch (Exception ex) {
                    System.out.println("AppLock.AppLock() file fail");
            }

            // MD5 adquiere fallo
            if (lock_file == null) {
                    lock_file = new File(tmp_dir + key + ".app_lock");
            }

            lock_stream = new FileOutputStream(lock_file);

            String f_content = "Java AppLock Object\r\nLocked by key: " + key
                            + "\r\n";
            lock_stream.write(f_content.getBytes());

            lock_channel = lock_stream.getChannel();

            lock = lock_channel.tryLock();

            if (lock == null) {
                    throw new Exception("No es posible crear el Lock");
            }
    }

    /**
     * Libera el Lock.
     * Ahora otra instancia de la App puede ganar el lock.
     *
     * @throws Throwable
     */
    private void release() throws Throwable {
            if (lock.isValid()) {
                    lock.release();
            }
            if (lock_stream != null) {
                    lock_stream.close();
            }
            if (lock_channel.isOpen()) {
                    lock_channel.close();
            }
            if (lock_file.exists()) {
                    lock_file.delete();
            }
    }

    @Override
    protected void finalize() throws Throwable {
            this.release();
            super.finalize();
    }

    /** The instance. */
    private static AppLock instance;

    /**
     * Establece un lock de la aplicacion.
     * Metodo solo puede ejecutarse una vez por aplicacion.
     * Toda llamada siguiente sera ignorada.
     *
     * @param key llave lock unica de la applicacion
     * @return true, si es exitosa
     */
    public static boolean setLock(String key) {
            if (instance != null) {
                    return true;
            }

            try {
                    instance = new AppLock(key);
            } catch (Exception ex) {
                    instance = null;
                    Logger.getLogger(AppLock.class.getName()).log(Level.SEVERE, "Fallo al establecer el Lock del App", ex);
                    return false;
            }

            Runtime.getRuntime().addShutdownHook(new Thread() {
                    @Override
                    public void run() {
                            AppLock.releaseLock();
                    }
            });
            return true;
    }

    /**
     * Tratando de liberar el Lock.
     * Luego de liberado, no es posible usar AppLock nuevamente el la aplicacion
     */
    public static void releaseLock() {
            try {
                if (instance == null) {
                        throw new NoSuchFieldException("INSTATCE IS NULL");
                }
                instance.release();
            } catch (Throwable ex) {
                    Logger.getLogger(AppLock.class.getName()).log(Level.SEVERE, "Fallo al liberar", ex);
            }
    }
	
}
