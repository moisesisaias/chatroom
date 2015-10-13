package chattuuClient.visuals;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;

import chattuuClient.controller.ActionConnect;
import chattuuClient.controller.MessagesManager;
import chattuuClient.model.ClientSocket;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ChatFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	// TODO cambiar el nombre, tip: hacer refactor
	private JTextArea txtrMsglog;
	
	private JScrollPane scrollPane_2;
	private JTextArea txtrWritemsg;
	private JButton btnSend;
	private JButton btnDisconnect;
	private JFrame parent;
	private ClientSocket clientSocket;
	private MessagesManager messagesManager;
	private Thread thrMsgManager;
	
	

	
	public ChatFrame(JFrame parent, ClientSocket clientSocket) {
		initialize();
		this.parent = parent;
		this.clientSocket = clientSocket;
		
		setTitle(clientSocket.getName() + " - Chattuu");
		
		messagesManager = MessagesManager.getManager(this);
		thrMsgManager = new Thread(messagesManager);
		
		thrMsgManager.start();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
		// TODO sacar en otra clase
		addWindowFocusListener(new WindowFocusListener() {
			
			public void windowLostFocus(WindowEvent e) {
				
			}
			public void windowGainedFocus(WindowEvent e) {
				txtrWritemsg.grabFocus();	
			}
		});
		
		setMinimumSize(new Dimension(500, 350));
		setBounds(100, 100, 500, 433);
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[110px:150px:450px,grow][200px:250.00,grow][110px:110.00]", "[grow][40px:40px][40px:40px]"));
		
		
		
		
		
		scrollPane = new JScrollPane();
		scrollPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scrollPane.setAutoscrolls(true);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(scrollPane, "cell 0 0 3 1,grow");
		
		txtrMsglog = new JTextArea();
		txtrMsglog.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				scrollPane.getVerticalScrollBar().setAutoscrolls(true);
			}
		});
		txtrMsglog.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtrMsglog.setEditable(false);
		txtrMsglog.setLineWrap(true);
		txtrMsglog.setWrapStyleWord(true);
		txtrMsglog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(txtrMsglog);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setAutoscrolls(true);
		scrollPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(scrollPane_2, "cell 0 1 2 2,grow");
		
		txtrWritemsg = new JTextArea();
		txtrWritemsg.setLineWrap(true);
		txtrWritemsg.setWrapStyleWord(true);
		txtrWritemsg.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtrWritemsg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.isShiftDown() ) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER){
						txtrWritemsg.append("\n");
					}
			    } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			    	e.consume();
			    	btnSend.doClick();
				}
			}
		});
		scrollPane_2.setViewportView(txtrWritemsg);
		
		btnSend = new JButton("Enviar");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtrWritemsg.getText().equals("")) {
					messagesManager.write(getTxtrWritemsg().getText());
				}
				
			}
		});
		btnSend.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(btnSend, "cell 2 1,grow");
		
		btnDisconnect = new JButton("Desconectar");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		btnDisconnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(btnDisconnect, "cell 2 2,grow");
	}
	
	// TODO verificar método, verificar si cliente se queda arriba
	private void close() {
		int n = JOptionPane	.showConfirmDialog(
						this,
						"Seguro desea cerrar chat y salir a la ventana anterior?\nSe desconectara del Servidor.",
						"Cerrar Chat", JOptionPane.YES_NO_OPTION);
		if (n == 0) {
			if (clientSocket.isConnected() && !clientSocket.isClosed()) {
				try {
					messagesManager.setTerminate(true);
					PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
							true);
					out.println(ActionConnect.MAGIC_WORD);
					out.flush();
					clientSocket.shutdownOutput();
					clientSocket.shutdownInput();
					
					clientSocket.close();
					MessagesManager.resetManager();
					System.out.println("El chat ha cerrado correctamente ... ");
				} catch (IOException e) {
					e.printStackTrace();
				} 
				parent.setVisible(true);
				ChatFrame.this.dispose();

			}else {
				System.out.println("Hola, hay problemas");
				parent.setVisible(true);
				ChatFrame.this.dispose();
			}
		}
	}
	
	public void forceTerminate() {
		if (clientSocket.isConnected() && !clientSocket.isClosed()) {
			try {
				messagesManager.setTerminate(true);
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
						true);
				out.println(ActionConnect.MAGIC_WORD);
				out.flush();
				clientSocket.shutdownOutput();
				clientSocket.shutdownInput();
				
				clientSocket.close();
				MessagesManager.resetManager();
				System.out.println("El chat ha cerrado correctamente ... ");
			} catch (IOException e) {
				e.printStackTrace();
			} 
			parent.setVisible(true);
			ChatFrame.this.dispose();

		}else {
			System.out.println("Hola, hay problemas");
			parent.setVisible(true);
			ChatFrame.this.dispose();
		}
	}
	
	public JFrame getParent() {
		return parent;
	}

	public ClientSocket getClientSocket() {
		return clientSocket;
	}
	
	public JTextArea getTxtrMsglog() {
		return txtrMsglog;
	}


	public JTextArea getTxtrWritemsg() {
		return txtrWritemsg;
	}


}
