package chattuuServer.model;

import java.net.Socket;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ActiveClientsTest</code> contains tests for the class <code>{@link ActiveClients}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class ActiveClientsTest {
	/**
	 * Run the ActiveClients(ArrayList<ClientSocket>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testActiveClients_1()
		throws Exception {
		ArrayList<ClientSocket> clients = new ArrayList();

		ActiveClients result = new ActiveClients(clients);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEmpty());
		assertEquals(0, result.size());
	}

	/**
	 * Run the void add(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());
		ClientSocket client = new ClientSocket(new Socket());

		fixture.add(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
	}

	/**
	 * Run the ClientSocket getClient(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetClient_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());
		int clientIndex = 1;

		ClientSocket result = fixture.getClient(clientIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at chattuuServer.model.ActiveClients.getClient(ActiveClients.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<ClientSocket> getClients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetClients_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());

		ArrayList<ClientSocket> result = fixture.getClients();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ActiveClients getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ActiveClients result = ActiveClients.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEmpty());
		assertEquals(0, result.size());
	}

	/**
	 * Run the ActiveClients getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		ActiveClients result = ActiveClients.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEmpty());
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean remove(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());
		ClientSocket client = new ClientSocket(new Socket());

		boolean result = fixture.remove(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(ClientSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());
		ClientSocket client = new ClientSocket(new Socket());

		boolean result = fixture.remove(client);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.model.ClientSocket.<init>(ClientSocket.java:21)
		assertTrue(result);
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		ActiveClients fixture = new ActiveClients(new ArrayList());

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(ActiveClientsTest.class);
	}
}