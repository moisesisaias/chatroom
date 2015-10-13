package chattuuClient.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import chattuuClient.model.ClientSocket;
import chattuuClient.visuals.ChatFrame;
import chattuuClient.visuals.MainFrame;

public class ActionConnect implements ActionListener {
	
	private MainFrame parent;
	private ClientSocket clientSocket;
	private ChatFrame chatuu;
	public final static String MAGIC_WORD = "+*JEYMOICHATTUUFIN*+";
	
	public ActionConnect(MainFrame parent) {
		this.parent = parent;
	}
	
	
	public MainFrame getParent() {
		return parent;
	}


	public ClientSocket getClientSocket() {
		return clientSocket;
	}


	public ChatFrame getChatuu() {
		return chatuu;
	}


	// TODO: verificar método
	public void actionPerformed(ActionEvent e) {
			// TODO: refactoring, variable explicativa
			if (Validate.validIp(parent.getTxtIp().getText(),parent.getTxtrErrorlog())
					&& Validate.validPort(parent.getTxtPort().getText(),parent.getTxtrErrorlog())
						&& Validate.validUserName(parent.getTxtUserName().getText().trim(), parent.getTxtrErrorlog())) {
				
				String ip = parent.getTxtIp().getText().trim();
				int port = Integer.parseInt(parent.getTxtPort().getText().trim());
				try {
					// colocar el nomber
					clientSocket = new ClientSocket(new Socket(ip, port), parent.getTxtUserName().getText().trim());
					chatuu = new ChatFrame(parent, clientSocket);
					
					
					parent.getTxtrErrorlog().setText("");
					setNotVisible();
					chatuu.setVisible(true);
				} catch (UnknownHostException e1) {
					parent.getTxtrErrorlog().setText("Host desconocido. EXCEPTION: "
							+ e1.toString());
					return;
				} catch (ConnectException e1) {
					parent.getTxtrErrorlog().setText("No se pudo establecer conexion con el servidor. EXCEPTION: "+ e1.toString());

					return;
				} catch (IOException e1) {
					parent.getTxtrErrorlog().setText("EXCEPTION: " + e1.toString());
					return;
				}
			}
		
	}
	
	private void setNotVisible(){
		parent.setVisible(false);
	}

}
