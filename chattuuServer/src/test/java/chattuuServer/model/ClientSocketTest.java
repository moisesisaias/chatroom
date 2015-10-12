package chattuuServer.model;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClientSocketTest</code> contains tests for the class <code>{@link ClientSocket}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class ClientSocketTest {
	/**
	 * Run the ClientSocket(Socket) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClientSocket_1()
		throws Exception {
		Socket socket = new Socket();

		ClientSocket result = new ClientSocket(socket);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClientSocket_2()
		throws Exception {
		Socket socket = new Socket();

		ClientSocket result = new ClientSocket(socket);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");
		Object obj = new ClientSocket(new Socket());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");
		Object obj = new ClientSocket(new Socket());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the String getAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetAddress_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		String result = fixture.getAddress();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the Date getConnectionDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetConnectionDate_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		Date result = fixture.getConnectionDate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetOutputStream_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetOutputStream_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		int result = fixture.getPort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertEquals(0, result);
	}

	/**
	 * Run the Socket getSocket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetSocket_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		Socket result = fixture.getSocket();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isClosed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsClosed_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		boolean result = fixture.isClosed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean isClosed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsClosed_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		boolean result = fixture.isClosed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsConnected_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		boolean result = fixture.isConnected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsConnected_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		boolean result = fixture.isConnected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the void setAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetAddress_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");
		String address = "";

		fixture.setAddress(address);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void shutdownInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testShutdownInput_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.shutdownInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void shutdownInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testShutdownInput_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.shutdownInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void shutdownOutput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testShutdownOutput_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.shutdownOutput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the void shutdownOutput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testShutdownOutput_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		fixture.shutdownOutput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket());
		fixture.setName("");
		fixture.setAddress("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientSocketTest.class);
	}
}