/**
 * 
 */
package chattuuServer.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chattuuServer.visuals.ServerFrame;

public class ConnectionsManagerTest {

	ConnectionsManager connectionsManager;
	ServerFrame serverFrame;
	Thread thrToConManager;

	@Before
	public void setUp() {
		serverFrame = ServerFrame.getFrameInstance();
		connectionsManager = ConnectionsManager.getManager(serverFrame);
		thrToConManager = new Thread(connectionsManager);
		thrToConManager.start();
	}

	@After
	public void tearDown() throws InterruptedException {
		connectionsManager.setTerminate(true);

		Thread.sleep(1200);

		ConnectionsManager.resetManager();

		serverFrame = null;
	}

	@Test
	public void testGetManager() {
		assertSame("El patrón de diseño singleto esta funcionando mal", connectionsManager,
				serverFrame.getConnectionsManager());

		Socket so;
		try {
			so = new Socket(InetAddress.getLocalHost().getHostAddress(), 30000);

			try {
				if (!so.isClosed()) {
					so.close();
				}
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

		assertSame("La lista de clientes es diferente", connectionsManager.getClients(), serverFrame.getClients());
		assertEquals("La lista de clientes es diferente", connectionsManager.getClients().size(),
				serverFrame.getClients().size());

	}

}
