package chattuuServer.controller;

import org.junit.*;
import chattuuServer.model.ActiveClients;
import chattuuServer.visuals.ServerFrame;
import static org.junit.Assert.*;

/**
 * The class <code>MessagesManagerTest</code> contains tests for the class <code>{@link MessagesManager}</code>.
 *
 * @generatedBy CodePro at 10/11/15 7:14 PM
 * @author junior
 * @version $Revision: 1.0 $
 */
public class MessagesManagerTest {
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
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
		fixture.setTerminate(true);

		ActiveClients result = fixture.getClients();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEmpty());
		assertEquals(0, result.size());
	}

	/**
	 * Run the MessagesManager getManager(ServerFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetManager_1()
		throws Exception {
		ServerFrame parent = ServerFrame.getFrameInstance();

		MessagesManager result = MessagesManager.getManager(parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isTerminate());
	}

	/**
	 * Run the MessagesManager getManager(ServerFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testGetManager_2()
		throws Exception {
		ServerFrame parent = ServerFrame.getFrameInstance();

		MessagesManager result = MessagesManager.getManager(parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isTerminate());
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
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
		fixture.setTerminate(true);

		ServerFrame result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
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
		assertEquals("chattuuServer.visuals.ServerFrame[frame0,100,100,660x406,invalid,hidden,layout=java.awt.BorderLayout,title=Chattuu Server,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", result.toString());
		assertEquals("frame0", result.getName());
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
	 * Run the boolean isTerminate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/11/15 7:14 PM
	 */
	@Test
	public void testIsTerminate_1()
		throws Exception {
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
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
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
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

		MessagesManager.resetManager();

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
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
		fixture.setTerminate(true);

		fixture.run();

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
		MessagesManager fixture = MessagesManager.getManager(ServerFrame.getFrameInstance());
		fixture.setTerminate(true);
		boolean terminate = true;

		fixture.setTerminate(terminate);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(MessagesManagerTest.class);
	}
}