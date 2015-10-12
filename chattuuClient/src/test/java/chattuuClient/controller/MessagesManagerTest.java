package chattuuClient.controller;

import java.net.Socket;
import javax.swing.JFrame;
import chattuuClient.visuals.ChatFrame;
import org.junit.*;
import chattuuClient.model.ClientSocket;
import static org.junit.Assert.*;

/**
 * The class <code>MessagesManagerTest</code> contains tests for the class <code>{@link MessagesManager}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:09 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class MessagesManagerTest {
	/**
	 * Run the MessagesManager getManager(ChatFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetManager_1()
		throws Exception {
		ChatFrame chat = new ChatFrame(new JFrame(), new ClientSocket(new Socket(), ""));

		MessagesManager result = MessagesManager.getManager(chat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the MessagesManager getManager(ChatFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testGetManager_2()
		throws Exception {
		ChatFrame chat = new ChatFrame(new JFrame(), new ClientSocket(new Socket(), ""));

		MessagesManager result = MessagesManager.getManager(chat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_1()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_2()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_3()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_4()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_5()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_6()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_7()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRead_8()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.read();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void resetManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testResetManager_1()
		throws Exception {

		MessagesManager.resetManager();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void setTerminate(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testSetTerminate_1()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);
		boolean terminate = true;

		fixture.setTerminate(terminate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void write(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testWrite_1()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);
		String text = "";

		fixture.write(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void write(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testWrite_2()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);
		String text = "";

		fixture.write(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuClient.model.ClientSocket.<init>(ClientSocket.java:34)
	}

	/**
	 * Run the void write(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testWrite_3()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(new ChatFrame(new JFrame(), new ClientSocket(new Socket(), "")));
		fixture.setTerminate(true);
		String text = "";

		fixture.write(text);

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
		new org.junit.runner.JUnitCore().run(MessagesManagerTest.class);
	}
}