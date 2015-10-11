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

public class ChatFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// TODO:  usar extends o atributo, si se usa extends no usar atributo
	//private JFrame frmChattuu;
	private JScrollPane scrollPane_1;
	private JTextArea txtrLog;
	private JScrollPane scrollPane;
	
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
		messagesManager = MessagesManager.getManager(this);
		thrMsgManager = new Thread(messagesManager);
		 
		thrMsgManager.start();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frmChattuu = new JFrame();
		// frmChattuu.addWindowListener(new WindowAdapter() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
		// TODO sacar en otra clase
		addWindowFocusListener(new WindowFocusListener() {
			@Override
			public void windowLostFocus(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowGainedFocus(WindowEvent e) {
				txtrWritemsg.grabFocus();	
			}
		});
		
		// frmChattuu.setTitle("Chattuu");
		setTitle("Chattuu");
		// frmChattuu.setMinimumSize(new Dimension(500, 350));
		setMinimumSize(new Dimension(500, 350));
		// frmChattuu.setBounds(100, 100, 500, 433);
		setBounds(100, 100, 500, 433);
		// frmChattuu.setBounds(100, 100, 500, 300);
		setBounds(100, 100, 500, 300);
		// frmChattuu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//frmChattuu.getContentPane().setLayout(new MigLayout("", "[110px:150px:450px,grow][200px:250.00,grow][110px:110.00]", "[grow][70px:75px][70px:75px]"));
		getContentPane().setLayout(new MigLayout("", "[110px:150px:450px,grow][200px:250.00,grow][110px:110.00]", "[grow][70px:75px][70px:75px]"));
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//frmChattuu.getContentPane().add(scrollPane_1, "cell 0 0 1 3,grow");
		getContentPane().add(scrollPane_1, "cell 0 0 1 3,grow");
		
		txtrLog = new JTextArea();
		txtrLog.setEditable(false);
		txtrLog.setLineWrap(true);
		txtrLog.setWrapStyleWord(true);
		txtrLog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setViewportView(txtrLog);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//frmChattuu.getContentPane().add(scrollPane, "cell 1 0 2 1,grow");
		getContentPane().add(scrollPane, "cell 1 0 2 1,grow");
		
		txtrMsglog = new JTextArea();
		txtrMsglog.setEditable(false);
		txtrMsglog.setLineWrap(true);
		txtrMsglog.setWrapStyleWord(true);
		txtrMsglog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(txtrMsglog);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//frmChattuu.getContentPane().add(scrollPane_2, "cell 1 1 1 2,grow");
		getContentPane().add(scrollPane_2, "cell 1 1 1 2,grow");
		
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
					txtrWritemsg.grabFocus();
				}
				
			}
		});
		btnSend.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		//frmChattuu.getContentPane().add(btnSend, "cell 2 1,grow");
		getContentPane().add(btnSend, "cell 2 1,grow");
		
		btnDisconnect = new JButton("Desconectar");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		btnDisconnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		//frmChattuu.getContentPane().add(btnDisconnect, "cell 2 2,grow");
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
				// TODO
				try {
					messagesManager.setTerminate(true);
					PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
							true);
					out.println(ActionConnect.MAGIC_WORD);
					out.flush();
					clientSocket.shutdownOutput();
					clientSocket.shutdownInput();
					
					clientSocket.close();
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
