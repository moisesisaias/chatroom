package chattuuClient;

import java.io.IOException;
//import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Start {

	public static void main(String[] args) throws UnknownHostException {
		// TODO: Do start.
		Socket so;
		try {
			 so = new Socket("10.0.0.12", 30000);
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				try {
					if(!so.isClosed()){
					so.close();}
				} catch (IOException e) {
					System.out.println("cierre de cliente");
					e.printStackTrace();
				}
		} catch (UnknownHostException e) {
			System.out.println("ip/host invalido");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ioExcepcion creando socket");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
