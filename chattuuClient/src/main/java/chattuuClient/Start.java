package chattuuClient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Prueba, comentar debajo para probar
		 * que funcione bien
		 * */
		Socket so;
		try {
			 so = new Socket("10.111.8.55", 30000);
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					if(!so.isClosed()){
					so.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("cierre de cliente");
					e.printStackTrace();
				}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("ip/host invalido");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ioExcepcion creando socket");
			e.printStackTrace();
		}
		
		
		
	}

}
