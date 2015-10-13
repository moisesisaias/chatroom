package chattuuClient.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.ServerSocket;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chattuuClient.visuals.MainFrame;

public class ActionConnectTest {
	
	MainFrame parent;
	ActionConnect action;

	@Before
	public void setUp() throws Exception {
		parent = MainFrame.getInstace();
		action = new ActionConnect(parent);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testActionConnect() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testActionConnect_withoutCallActionPerformed(){
		assertNull(action.getChatuu());
		assertNull(action.getClientSocket());
	}
	
	@Test
	public void testActionConnect_callActionPerformedWithInvalidValues(){
		action.actionPerformed(null);
		assertNull(action.getChatuu());
		assertNull(action.getClientSocket());
	}
	
	@Test
	public void testActionConnect_callActionPerformedWithValidValues(){
		try{
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ServerSocket ser = new ServerSocket(30000); 
					ser.setSoTimeout(3000);
					ser.accept();
					ser.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		th.start();
		
		parent.getTxtUserName().setText("John");
		parent.getTxtIp().setText("169.254.104.142");
		parent.getTxtPort().setText(Integer.toString(30000));
		action.actionPerformed(null);
		assertNotNull(action.getChatuu());
		assertNotNull(action.getClientSocket());}
		catch(Exception e){
			
		}
		
	}

}
