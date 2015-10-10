package controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import chattuuServer.visuals.ServerFrame;

public final class ConnectionsManager implements Runnable {

	private ServerSocket server;
	private ArrayList<ClientSocket> clients;
	private static ConnectionsManager instance;
	private ServerFrame parent;
	private DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-HH:mm:ss");

	private boolean terminate;

	private ConnectionsManager(ServerFrame parent) {
		super();
		this.server = parent.getServer();
		this.clients = parent.getClients();
		this.parent = parent;
		this.terminate = false;
	}

	public static ConnectionsManager getManager(ServerFrame parent) {

		if (instance == null) {
			instance = new ConnectionsManager(parent);
		}

		instance.setTerminate(false);
		return instance;

	}

	public boolean isTerminate() {
		return terminate;
	}

	public void setTerminate(boolean terminate) {
		this.terminate = terminate;
	}

	public ServerSocket getServer() {
		return server;
	}

	public ArrayList<ClientSocket> getClients() {
		return clients;
	}

	public ConnectionsManager getInstance() {
		return instance;
	}

	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public ServerFrame getParent() {
		return parent;
	}

	public void run() {
		// TODO: volver a porner !terminate
		while (clients.size() < 2){
			try {
				Socket socket = server.accept();
				if (socket != null) {
					ClientSocket client = new ClientSocket(socket);

					synchronized (clients) {
						clients.add(client);
						 String message = socketConnectedMessage(client);
						 parent.getTxtrPrompt().append(message);
					}
					

				}
				
				
				 
			} catch (IOException e1) {
				// TODO: algo
				// e1.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				// e.printStackTrace();
			}

		}
		if(close()){
			
		}else{
			System.out.println("Fallo cerrando server y sockets");
		}

	}

	public String socketConnectedMessage(ClientSocket client) {

		String strDateFormat = dateFormat.format(client.getConnectionDate()) + ": ";

		String hostNameAddress = client.getName() + " con IP " + client.getAddress();

		String message = strDateFormat + hostNameAddress + " y puerto " + client.getPort() + " acaba de conectarse\n";

		return message;

	}

	public boolean close() {

		boolean closed = true;
		/*
		for(ClientSocket client : clients){
			closeClientSocket(client);
		}*/
		
		if(!getServer().isClosed()){
			try {
				getServer().close();
			} catch (IOException e) {
				closed = false;
				// TODO Auto-generated catch block
				System.out.println("cerrando el servidor");
				e.printStackTrace();
			}
		}

		return closed;

	}

	public void closeClientSocket(ClientSocket client) {
		try {
			if (!client.getSocket().isClosed()) {
				//client.getSocket().getInputStream().close();
				//client.getSocket().getOutputStream().close();
				client.getSocket().close();
			}

			clients.remove(client);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cerrando cliente");
			e.printStackTrace();
		}

	}

}
