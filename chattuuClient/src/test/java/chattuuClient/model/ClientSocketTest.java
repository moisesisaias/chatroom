package chattuuClient.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClientSocketTest</code> contains tests for the class <code>{@link ClientSocket}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:09 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class ClientSocketTest {
	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_1()
		throws Exception {
		Socket socket = new Socket();
		String name = "";

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_2()
		throws Exception {
		Socket socket = new Socket();
		String name = null;

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_3()
		throws Exception {
		Socket socket = new Socket();
		String name = null;

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_4()
		throws Exception {
		Socket socket = new Socket();
		String name = "";

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_5()
		throws Exception {
		Socket socket = new Socket();
		String name = "";

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_6()
		throws Exception {
		Socket socket = new Socket();
		String name = "";

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the ClientSocket(Socket,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClientSocket_7()
		throws Exception {
		Socket socket = new Socket();
		String name = "";

		ClientSocket result = new ClientSocket(socket, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");
		Object obj = new ClientSocket(new Socket(), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");
		Object obj = new ClientSocket(new Socket(), "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the String getAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetAddress_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		String result = fixture.getAddress();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the Date getConnectionDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetConnectionDate_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		Date result = fixture.getConnectionDate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetInputStream_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		InputStream result = fixture.getInputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetInputStream_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		InputStream result = fixture.getInputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetOutputStream_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the OutputStream getOutputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetOutputStream_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		OutputStream result = fixture.getOutputStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		int result = fixture.getPort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertEquals(0, result);
	}

	/**
	 * Run the Socket getSocket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetSocket_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		Socket result = fixture.getSocket();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the String getoName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetoName_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		String result = fixture.getoName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isClosed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsClosed_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isClosed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isClosed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsClosed_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isClosed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsConnected_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isConnected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsConnected_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isConnected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInputShutdown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsInputShutdown_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isInputShutdown();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInputShutdown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsInputShutdown_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isInputShutdown();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOutputShutdown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsOutputShutdown_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isOutputShutdown();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOutputShutdown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testIsOutputShutdown_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		boolean result = fixture.isOutputShutdown();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertTrue(result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void shutdownInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testShutdownInput_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.shutdownInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void shutdownInput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testShutdownInput_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.shutdownInput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void shutdownOutput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testShutdownOutput_1()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.shutdownOutput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void shutdownOutput() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testShutdownOutput_2()
		throws Exception {
		ClientSocket fixture = new ClientSocket(new Socket(), "");
		fixture.setName("");

		fixture.shutdownOutput();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
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
	 * @generatedBy CodePro at 10/11/15 7:09 PM
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
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientSocketTest.class);
	}
}