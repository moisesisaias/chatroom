package chattuuClient.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

public class ClientSocket {

	private String name;
	private String oName;
	private String address;
	private int port;
	private Socket socket;
	private Date connectionDate;
	private InetAddress inetA;

	public ClientSocket(Socket socket, String name) throws SocketException {
		super();
		
		try {
			this.inetA = InetAddress.getLocalHost();
		} catch (UnknownHostException e2) {
			this.inetA = socket.getLocalAddress();
			//e2.printStackTrace();
		}
		
		this.socket = socket;
		this.oName = inetA.getHostName();
		this.address = socket.getInetAddress().getHostAddress();
		this.port = socket.getPort();
		this.socket.setSoTimeout(500);
		
		if(name != null && !name.equals("")){
			this.name = name;
		}else{
			this.name = "Anonimo";
		}
		
		connectionDate = new Date();

	}

	protected String getoName() {
		return oName;
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

	public boolean isOutputShutdown() {
		return socket.isOutputShutdown();
	}

	public boolean isInputShutdown() {
		return socket.isInputShutdown();
	}

	public InputStream getInputStream() throws IOException {
		return socket.getInputStream();
	}

}
