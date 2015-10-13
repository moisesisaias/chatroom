package chattuuClient.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chattuuClient.model.ClientSocket;
import chattuuClient.visuals.ChatFrame;

public class MessagesManagerTest {

	MessagesManager msgManager;
	ChatFrame chatFrame;
	ClientSocket clientSocket;
	Thread th;
	
	@Before
	public void setUp()  {
		 th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ServerSocket server = null;
				try{
					server = new ServerSocket(30000);
					server.setSoTimeout(500);
					while(true){
						server.accept();
						
						
					}
					
				}catch(Exception ignored){
					
				}finally{
					if(server != null)
					{
						try {
							server.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					}
				
			}
		});
		th.start();
		try {
			clientSocket = new ClientSocket(new Socket("localhost",30000), "Hola");
		} catch (SocketException e) {
			System.exit(1);
		} catch (UnknownHostException e) {
			System.exit(1);
		} catch (IOException e) {
			System.exit(1);
			
		}
		chatFrame = new ChatFrame(null, clientSocket);
		msgManager = MessagesManager.getManager(chatFrame);
	}

	@After
	public void tearDown() throws Exception {
		th.interrupt();
		
		MessagesManager.resetManager();
		chatFrame = null;
		
		
		
	}

	@Test
	public void testGetManager() {
		assertSame(msgManager, MessagesManager.getManager(chatFrame));
	}

	@Test
	public void testResetManager() {
		MessagesManager.resetManager();
		assertNotSame(msgManager, MessagesManager.getManager(chatFrame));
	}

	@Test
	public void testWrite() {
		msgManager.write("hola");
		
		
	}

	@Test
	public void testSetTerminate() {
		msgManager.setTerminate(true);
	
		assertFalse(th.isAlive());
	}

}
