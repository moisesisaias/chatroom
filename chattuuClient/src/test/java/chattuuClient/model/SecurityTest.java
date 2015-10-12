package chattuuClient.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SecurityTest</code> contains tests for the class <code>{@link Security}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:09 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class SecurityTest {
	/**
	 * Run the String decrypt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testDecrypt_1()
		throws Exception {
		String msg = "";

		String result = Security.decrypt(msg);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String encrypt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:09 PM
	 */
	@Test
	public void testEncrypt_1()
		throws Exception {
		String msg = "";

		String result = Security.encrypt(msg);

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(SecurityTest.class);
	}
}