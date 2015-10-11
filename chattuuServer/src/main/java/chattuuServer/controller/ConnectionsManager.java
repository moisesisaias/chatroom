package chattuuServer.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import chattuuServer.model.ActiveClients;
import chattuuServer.model.ClientSocket;
import chattuuServer.visuals.ServerFrame;

public final class ConnectionsManager implements Runnable {

	private ServerSocket server;
	private static ConnectionsManager instance;
	private ServerFrame parent;
	private ActiveClients clients;
	private DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-HH:mm:ss");
	private boolean terminate;

	private ConnectionsManager(ServerFrame parent) {
		super();
		this.server = parent.getServer();
		this.parent = parent;
		this.clients = parent.getClients();
		this.terminate = false;
	}

	public static ConnectionsManager getManager(ServerFrame parent) {
		if (instance == null) {
			instance = new ConnectionsManager(parent);
		}

		instance.setTerminate(false);
		return instance;
	}

	protected static void resetManager() {
		instance = null;
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
		while (clients.size() < 3 && !terminate) {
			try {
				Socket socket = server.accept();
				if (socket != null) {
					ClientSocket client = new ClientSocket(socket);

					clients.add(client);
					String message = socketConnectedMessage(client);
					parent.getTxtrPrompt().append(message);

				}

			} catch (IOException e1) {
				// TODO: algo
				// e1.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				// e.printStackTrace();
			}

		}
		
		if (!close()) {
			System.out.println("Fallo cerrando server y sockets");
		}

	}

	private String socketConnectedMessage(ClientSocket client) {

		String strDateFormat = dateFormat.format(client.getConnectionDate()) + ": ";

		String hostNameAddress = client.getName() + " con IP " + client.getAddress();

		String message = strDateFormat + hostNameAddress + " y puerto " + client.getPort() + " acaba de conectarse\n";

		return message;
	}

	public boolean close() {

		boolean closed = true;
		/*
		 * for(ClientSocket client : clients){ closeClientSocket(client); }
		 */
		parent.getMessagesManager().setTerminate(true);
		
		if (!getServer().isClosed()) {
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
				client.getSocket().shutdownInput();
				client.getSocket().shutdownOutput();
				client.getSocket().close();
			}

			clients.remove(client);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cerrando cliente");
			e.printStackTrace();
		}

	}

	public ActiveClients getClients() {
		
		return clients;
	}

}
