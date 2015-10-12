package chattuuServer.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import chattuuServer.visuals.ServerFrame;

public class ServerClosingAction extends WindowAdapter {
	
	
	private ServerFrame parent;
	
	public ServerClosingAction(ServerFrame parent) {
		this.parent = parent;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		if(parent.getServer() != null) {
			parent.getMessagesManager().sendExitKeyMessage();
			parent.getConnectionsManager().setTerminate(true);
			parent.getMessagesManager().setTerminate(true);
		}
		
		ConnectionsManager.resetManager();
		MessagesManager.resetManager();
		
		AppLock.releaseLock(); // lock liberado
	    
		if(ServerFrame.getFrameInstance() != null)
	    	ServerFrame.getFrameInstance().dispose();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException ignored) {
			// TODO: verificar que se puede ignorar.
			System.out.println("Ignorado.... ");
		}
	}

}
