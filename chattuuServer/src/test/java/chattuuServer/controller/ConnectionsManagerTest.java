package chattuuServer.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;

import chattuuServer.controller.ConnectionsManager;
import chattuuServer.model.ActiveClients;
import chattuuServer.visuals.ServerFrame;
import chattuuServer.model.ClientSocket;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConnectionsManagerTest</code> contains tests for the class <code>{@link ConnectionsManager}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
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
		assertSame("El patr�n de dise�o singleto esta funcionando mal", connectionsManager,
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
	
	/**
	 * Run the boolean close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		boolean result = fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.close(ConnectionsManager.java:117)
		assertTrue(result);
	}

	/**
	 * Run the boolean close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		boolean result = fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.close(ConnectionsManager.java:117)
		assertTrue(result);
	}

	/**
	 * Run the void closeClientSocket(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testCloseClientSocket_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		ClientSocket client = new ClientSocket(new Socket());

		fixture.closeClientSocket(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void closeClientSocket(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testCloseClientSocket_2()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		ClientSocket client = new ClientSocket(new Socket());

		fixture.closeClientSocket(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void closeClientSocket(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testCloseClientSocket_3()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		ClientSocket client = new ClientSocket(new Socket());

		fixture.closeClientSocket(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void closeClientSocket(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testCloseClientSocket_4()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		ClientSocket client = new ClientSocket(new Socket());

		fixture.closeClientSocket(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void closeClientSocket(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testCloseClientSocket_5()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		ClientSocket client = new ClientSocket(new Socket());

		fixture.closeClientSocket(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the ActiveClients getClients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetClients_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		ActiveClients result = fixture.getClients();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DateFormat getDateFormat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetDateFormat_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		DateFormat result = fixture.getDateFormat();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isLenient());
	}

	/**
	 * Run the ConnectionsManager getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		ConnectionsManager result = fixture.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getClients());
		assertEquals(true, result.isTerminate());
		assertEquals(null, result.getServer());
	}

	/**
	 * Run the ConnectionsManager getManager(ServerFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetManager_1()
		throws Exception {
		ServerFrame parent = ServerFrame.getFrameInstance();

		ConnectionsManager result = ConnectionsManager.getManager(parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getClients());
		assertEquals(false, result.isTerminate());
		assertEquals(null, result.getServer());
	}

	/**
	 * Run the ConnectionsManager getManager(ServerFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetManager_2()
		throws Exception {
		ServerFrame parent = ServerFrame.getFrameInstance();

		ConnectionsManager result = ConnectionsManager.getManager(parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getClients());
		assertEquals(false, result.isTerminate());
		assertEquals(null, result.getServer());
	}

	/**
	 * Run the ServerFrame getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		ServerFrame result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getClients());
		assertEquals(null, result.getConnectionsManager());
		assertEquals(null, result.getMessagesManager());
		assertEquals(null, result.getThrToMsgManager());
		assertEquals(null, result.getServer());
		assertEquals(null, result.getGraphics());
		assertEquals(3, result.getDefaultCloseOperation());
		assertEquals(null, result.getJMenuBar());
		assertEquals(null, result.getTransferHandler());
		assertEquals(0, result.getState());
		assertEquals(null, result.getMenuBar());
		assertEquals(false, result.isResizable());
		assertEquals(0, result.getCursorType());
		assertEquals(0, result.getExtendedState());
		assertEquals(null, result.getIconImage());
		assertEquals(null, result.getMaximizedBounds());
		assertEquals(false, result.isUndecorated());
		assertEquals("Chattuu Server", result.getTitle());
		assertEquals(true, result.isOpaque());
		assertEquals(null, result.getOwner());
		assertEquals(false, result.isShowing());
		assertEquals(false, result.isActive());
		assertEquals(null, result.getBufferStrategy());
		assertEquals(null, result.getFocusCycleRootAncestor());
		assertEquals(true, result.getFocusableWindowState());
		assertEquals(null, result.getWarningString());
		assertEquals(false, result.isAlwaysOnTop());
		assertEquals(true, result.isAlwaysOnTopSupported());
		assertEquals(true, result.isAutoRequestFocus());
		assertEquals(true, result.isFocusCycleRoot());
		assertEquals(true, result.isFocusableWindow());
		assertEquals(false, result.isFocused());
		assertEquals(false, result.isLocationByPlatform());
		assertEquals(true, result.isValidateRoot());
		assertEquals(null, result.getFocusOwner());
		assertEquals(1.0f, result.getOpacity(), 1.0f);
		assertEquals(null, result.getShape());
		assertEquals(1, result.getComponentCount());
		assertEquals(1, result.countComponents());
		assertEquals(0.5f, result.getAlignmentX(), 1.0f);
		assertEquals(0.5f, result.getAlignmentY(), 1.0f);
		assertEquals(false, result.isFocusTraversalPolicyProvider());
		assertEquals(true, result.isFocusTraversalPolicySet());
		assertEquals("chattuuServer.visuals.ServerFrame[frame1,100,100,660x406,invalid,hidden,layout=java.awt.BorderLayout,title=Chattuu Server,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", result.toString());
		assertEquals("frame1", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isValid());
		assertEquals(true, result.isEnabled());
		assertEquals(660, result.getWidth());
		assertEquals(100, result.getY());
		assertEquals(406, result.getHeight());
		assertEquals(100, result.getX());
		assertEquals(null, result.getForeground());
		assertEquals(null, result.getFont());
		assertEquals(false, result.hasFocus());
		assertEquals(false, result.isVisible());
		assertEquals(null, result.getPeer());
		assertEquals(false, result.isMinimumSizeSet());
		assertEquals(null, result.getMousePosition());
		assertEquals(false, result.isFocusOwner());
		assertEquals(true, result.isFocusable());
		assertEquals(false, result.isLightweight());
		assertEquals(false, result.isMaximumSizeSet());
		assertEquals(false, result.isPreferredSizeSet());
		assertEquals(false, result.isDisplayable());
		assertEquals(null, result.getDropTarget());
		assertEquals(true, result.getFocusTraversalKeysEnabled());
		assertEquals(false, result.getIgnoreRepaint());
		assertEquals(null, result.getInputMethodRequests());
		assertEquals(true, result.isBackgroundSet());
		assertEquals(true, result.isCursorSet());
		assertEquals(false, result.isDoubleBuffered());
		assertEquals(true, result.isFocusTraversable());
		assertEquals(false, result.isFontSet());
		assertEquals(false, result.isForegroundSet());
		assertEquals(false, result.requestFocusInWindow());
	}

	/**
	 * Run the ServerSocket getServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetServer_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		ServerSocket result = fixture.getServer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isTerminate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsTerminate_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		boolean result = fixture.isTerminate();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isTerminate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsTerminate_2()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		boolean result = fixture.isTerminate();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void resetManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testResetManager_1()
		throws Exception {

		ConnectionsManager.resetManager();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_4()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_5()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_6()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_7()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_8()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_9()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_10()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_11()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_12()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_13()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_14()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(false);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_15()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRun_16()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ConnectionsManager.run(ConnectionsManager.java:72)
	}

	/**
	 * Run the void setDateFormat(DateFormat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetDateFormat_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		DateFormat dateFormat = DateFormat.getDateInstance();

		fixture.setDateFormat(dateFormat);

		// add additional test code here
	}

	/**
	 * Run the void setTerminate(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetTerminate_1()
		throws Exception {
		ConnectionsManager fixture = ConnectionsManager.getManager(ServerFrame.getFrameInstance());
		fixture.setDateFormat(DateFormat.getDateInstance());
		fixture.setTerminate(true);
		boolean terminate = true;

		fixture.setTerminate(terminate);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConnectionsManagerTest.class);
	}
}