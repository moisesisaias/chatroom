package chattuuServer.controller;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import chattuuServer.visuals.ServerFrame;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServerClosingActionTest</code> contains tests for the class <code>{@link ServerClosingAction}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class ServerClosingActionTest {
	/**
	 * Run the ServerClosingAction(ServerFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testServerClosingAction_1()
		throws Exception {
		ServerFrame parent = ServerFrame.getFrameInstance();

		ServerClosingAction result = new ServerClosingAction(parent);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void windowClosing(WindowEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testWindowClosing_1()
		throws Exception {
		ServerClosingAction fixture = new ServerClosingAction(ServerFrame.getFrameInstance());
		WindowEvent e = new WindowEvent(new Window(new Frame()), 1);

		fixture.windowClosing(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ServerClosingAction.windowClosing(ServerClosingAction.java:20)
	}

	/**
	 * Run the void windowClosing(WindowEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testWindowClosing_2()
		throws Exception {
		ServerClosingAction fixture = new ServerClosingAction(ServerFrame.getFrameInstance());
		WindowEvent e = new WindowEvent(new Window(new Frame()), 1);

		fixture.windowClosing(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ServerClosingAction.windowClosing(ServerClosingAction.java:20)
	}

	/**
	 * Run the void windowClosing(WindowEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testWindowClosing_3()
		throws Exception {
		ServerClosingAction fixture = new ServerClosingAction(ServerFrame.getFrameInstance());
		WindowEvent e = new WindowEvent(new Window(new Frame()), 1);

		fixture.windowClosing(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at chattuuServer.controller.ServerClosingAction.windowClosing(ServerClosingAction.java:20)
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
		new org.junit.runner.JUnitCore().run(ServerClosingActionTest.class);
	}
}