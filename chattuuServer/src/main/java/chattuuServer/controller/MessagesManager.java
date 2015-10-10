package chattuuServer.controller;

import chattuuServer.model.ActiveClients;
import chattuuServer.model.ClientSocket;
import chattuuServer.visuals.ServerFrame;

public final class MessagesManager implements Runnable {

	private ServerFrame parent;
	private boolean terminate;
	private static MessagesManager instance;
	private ActiveClients clients;
	
	
	private MessagesManager(ServerFrame parent){
		this.parent = parent;
		this.clients = parent.getClients();
	}
	
	public static MessagesManager getManager(ServerFrame parent){
		if(instance == null){
			instance = new MessagesManager(parent);
		}
		return instance;
	}
	
	
	public void run(){
		while(!terminate){
			
		}
	}
	
	
	
	public synchronized boolean isTerminate() {
		return terminate;
	}

	public synchronized void setTerminate(boolean terminate) {
		this.terminate = terminate;
	}

	public synchronized ServerFrame getParent() {
		return parent;
	}

	public synchronized ActiveClients getClients() {
		return clients;
	}

	/**
	 * leer si hay mensajes.
	 */
	private void readAll(){
		
	}
	
	
	/**
	 * 
	 */
	private void read(ClientSocket socket){
		
	}
}
