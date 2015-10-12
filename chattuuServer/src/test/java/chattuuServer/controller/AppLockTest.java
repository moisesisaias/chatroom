package chattuuServer.controller;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AppLockTest</code> contains tests for the class <code>{@link AppLock}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class AppLockTest {
	/**
	 * Run the void releaseLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testReleaseLock_1()
		throws Exception {

		AppLock.releaseLock();

		// add additional test code here
	}

	/**
	 * Run the void releaseLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testReleaseLock_2()
		throws Exception {

		AppLock.releaseLock();

		// add additional test code here
	}

	/**
	 * Run the void releaseLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testReleaseLock_3()
		throws Exception {

		AppLock.releaseLock();

		// add additional test code here
	}

	/**
	 * Run the boolean setLock(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetLock_1()
		throws Exception {
		String key = "";

		boolean result = AppLock.setLock(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setLock(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetLock_2()
		throws Exception {
		String key = "";

		boolean result = AppLock.setLock(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setLock(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testSetLock_3()
		throws Exception {
		String key = "";

		boolean result = AppLock.setLock(key);

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(AppLockTest.class);
	}
}