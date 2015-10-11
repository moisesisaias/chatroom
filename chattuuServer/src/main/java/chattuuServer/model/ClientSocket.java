package chattuuServer.model;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Date;

public class ClientSocket {

	private String name;

	private String address;
	private int port;
	private Socket socket;
	private Date connectionDate;

	public ClientSocket(Socket socket) throws SocketException {
		super();
		this.socket = socket;
		this.name = socket.getInetAddress().getHostName();
		this.address = socket.getInetAddress().getHostAddress();
		this.port = socket.getPort();
		this.socket.setSoTimeout(100);
		connectionDate = new Date();

	}

	@Override
	public boolean equals(Object obj) {

		ClientSocket comp;

		if (obj instanceof ClientSocket) {
			comp = (ClientSocket) obj;
			String actualSocket = this.getAddress() + ":" + this.getPort();
			String otherSocket = comp.getAddress() + ":" + comp.getPort();

			if (actualSocket.equals(otherSocket)) {
				return true;
			} else {
				return false;
			}
		} else {

			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPort() {
		return port;
	}

	public Socket getSocket() {
		return socket;
	}

	public Date getConnectionDate() {
		return connectionDate;
	}

	public boolean isConnected(){
		return socket.isConnected();
	}
	
	public boolean isClosed(){
		return socket.isClosed();
	}

	public OutputStream getOutputStream() throws IOException {
		return socket.getOutputStream();
	}

	public void shutdownOutput() throws IOException {
		socket.shutdownOutput();
		
	}

	public void shutdownInput() throws IOException {
		socket.shutdownInput();
		
	}

	public void close() throws IOException {
		socket.close();
		
	}
	
	public String toString() {
		return address + ":" + port;
	}

}
