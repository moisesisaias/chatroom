package chattuuServer.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import chattuuServer.model.ActiveClients;
import chattuuServer.model.ClientSocket;
import chattuuServer.visuals.ServerFrame;

@SuppressWarnings("unused")
public final class MessagesManager implements Runnable {

	private ServerFrame parent;
	private boolean terminate;
	private static MessagesManager instance;
	private ActiveClients clients;

	private MessagesManager(ServerFrame parent) {
		this.parent = parent;
		this.clients = parent.getClients();
	}

	public static MessagesManager getManager(ServerFrame parent) {
		if (instance == null) {
			instance = new MessagesManager(parent);
		}
		return instance;
	}

	public void run() {
		while (!terminate) {
			readAll();
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
	 * lee si hay mensajes.
	 */
	private void readAll() {
		try {
			ArrayList<ClientSocket> clientSockets = new ArrayList<ClientSocket>(clients.getClients());
			if (clients.isEmpty()) {
				Thread.sleep(100);
			}

			for (int i = 0; i < clientSockets.size(); i++) {
				ClientSocket clientSocket = clientSockets.get(i);
				if (!clientSocket.getSocket().isClosed()) {
					if (!clientSocket.getSocket().isInputShutdown() && !clientSocket.getSocket().isOutputShutdown()) {
						read(clientSocket);
						// TODO este else if nunca ocurre
					}
				}
			}
		} catch (Exception e) {
			// TODO: hacer algo
		}

	}

	/**
	 * 
	 */
	private void read(ClientSocket clientSocket) {
		try {
			// TODO probar
			if (!clientSocket.getSocket().isClosed() && !clientSocket.getSocket().isInputShutdown()) {
				BufferedReader in = new BufferedReader(
						new InputStreamReader(clientSocket.getSocket().getInputStream()));
				String line;

				while ((line = in.readLine()) != null) {
					if (line.equals(ServerFrame.MAGIC_WORD)) { // socket.isClosed()||//------

						parent.getConnectionsManager().closeClientSocket(clientSocket);
						parent.getTxtrPrompt().append(clientSocket.getName() + " se ha desconectado\n");
					} else {
						parent.getTxtrPrompt().append("Mensaje recibito desde: " + clientSocket.getName() + "\n");
						parent.getTxtrPrompt().append("Redireccionando mensaje...\n");

						for (int i = 0; i < clients.size(); i++) {
							ClientSocket clSock = clients.getClient(i);

							try {
								// System.out.println(socketClients.indexOf(sock));
								if (!clSock.getSocket().isOutputShutdown()) {
									PrintWriter out = new PrintWriter(clSock.getSocket().getOutputStream(), true);
									out.println(line);
									out.flush();
								} else {
									// TODO
									parent.getTxtrPrompt().append(clSock.getName() + " Flujo de salida cerrado...\n");
								}

								// out.close();
							} catch (Exception e) {
								// TODO

							}

						}
					}
				}
			} else {
				// TODO HACER ALGO
				parent.getTxtrPrompt().append(clientSocket.getName() + " Flujo de entrada cerrado...\n");
			}
		} catch (IOException e) {
			// TODO hacer algo
		}
	}
	
	protected static void resetManager(){
		instance = null;
	}
}
