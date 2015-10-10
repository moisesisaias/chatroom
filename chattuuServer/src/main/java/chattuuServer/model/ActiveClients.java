package chattuuServer.model;

import java.util.ArrayList;

public class ActiveClients {
	
	private ArrayList<ClientSocket> clients;

	public ActiveClients() {
		super();
		clients = new ArrayList<ClientSocket>();
	}


	protected ActiveClients(ArrayList<ClientSocket> clients) {
		super();
		this.clients = clients;
	}

	public synchronized ArrayList<ClientSocket> getClients() {
		return clients;
	}
	
	public synchronized void add(ClientSocket client){
		clients.add(client);
	}
	
	public synchronized boolean remove (ClientSocket client){
		 return clients.remove(client);
	}
	
	public int size(){
		return clients.size();
	}

}
