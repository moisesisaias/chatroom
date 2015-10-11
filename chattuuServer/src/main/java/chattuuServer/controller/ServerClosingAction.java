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
		parent.getConnectionsManager().setTerminate(true);
		parent.getMessagesManager().setTerminate(true);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException ignored) {
			// TODO: verificar que se puede ignorar.
		}
	}

}