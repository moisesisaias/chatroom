package chattuuClient.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import chattuuClient.model.ClientSocket;
import chattuuClient.model.Security;
import chattuuClient.visuals.ChatFrame;

public final class MessagesManager implements Runnable{
	
	private static MessagesManager instance;
	private ChatFrame chat;
	private boolean terminate;
	
	
	private MessagesManager (ChatFrame chat){
		this.chat = chat;
	}
	
	public static MessagesManager getManager(ChatFrame chat){
		if(instance == null){
			instance = new  MessagesManager(chat);
		}
		
		return instance;
	}
	
	public static void resetManager(){
		instance = null;
	}
	
	public void run(){
		
		while(!terminate){
			read();
		}
		
	}
	
	public void read(){
		ClientSocket clientSocket = chat.getClientSocket();
		try { 
			if(!clientSocket.isInputShutdown()){
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				String line;
				while ((line = in.readLine()) != null && !clientSocket.isInputShutdown()) {
					if( !(line.equals(ActionConnect.MAGIC_WORD)) ) {	
						String msg = Security.decrypt(line.trim());
						msg = msg.replace("\n", "\n-> ");
						chat.getTxtrMsglog().append(msg+"\n");
					} else {
						chat.forceTerminate();
					}
				}
			}else{
				return;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// System.out.println("Tiempo de espera rebasado");
			//e.printStackTrace();
		}
		
	}
	
	public void write(String text){
		
		ClientSocket clientSocket = chat.getClientSocket();
		String msg = Security.encrypt("["+clientSocket.getName()+"]:: "+text);
		
		try {
			if(!clientSocket.isOutputShutdown()){
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
			
			//out.println(inetA.getHostName()+" ("+clientSocket.getLocalAddress().getHostAddress()
			//		+":"+clientSocket.getLocalPort()+"): "+text);
			
			out.println(msg);
			chat.getTxtrWritemsg().setText("");
			out.flush();
			
			} else {
				// TODO ALGO
				System.out.println("Cerrado el chat... ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setTerminate(boolean terminate) {
		this.terminate = terminate;
	}
	
	//TODO revisar método
}
