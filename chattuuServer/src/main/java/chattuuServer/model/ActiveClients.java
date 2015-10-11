package chattuuServer.model;

import java.util.ArrayList;

public final class ActiveClients {
	
	private ArrayList<ClientSocket> clients;
	private static ActiveClients instance;

	private ActiveClients() {
		super();
		clients = new ArrayList<ClientSocket>();
	}
	
	public static ActiveClients getInstance(){
		if(instance == null){
			instance = new ActiveClients();
		}
		return instance;
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
	
	public boolean isEmpty(){
		return clients.isEmpty();
	}
	// TODO: usar este metodo en vez de llamar getClients y luego get.
	public synchronized ClientSocket getClient(int clientIndex){
		return clients.get(clientIndex);
	}

}
