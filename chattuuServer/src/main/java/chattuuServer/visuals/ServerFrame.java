package chattuuServer.visuals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.awt.Cursor;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.SoftBevelBorder;

import chattuuServer.controller.ConnectionsManager;
import chattuuServer.controller.MessagesManager;
import chattuuServer.controller.ServerClosingAction;
import chattuuServer.model.ActiveClients;
import chattuuServer.model.ClientSocket;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;


public class ServerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIp;
	private JTextField txtPort;
	private ServerSocket server;
	private ActiveClients clients;
	private JScrollPane scrollPane;
	private JTextArea txtrPrompt;
	private JLabel lblIp;
	private JLabel lblPort;
	private int port = 30000;
	private ConnectionsManager connectionsManager;
	private Thread thrToConManager;
	private MessagesManager messagesManager;
	private Thread thrToMsgManager;
	public final static String MAGIC_WORD = "+*JEYMOICHATTUUFIN*+";
	private JScrollPane scrollPane_1;
	private JList list;
	private JButton btnErase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerFrame frame = new ServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public ConnectionsManager getConnectionsManager() {
		return connectionsManager;
	}

	
	public JTextArea getTxtrPrompt() {
		return txtrPrompt;
	}

	public void setServer(ServerSocket server) {
		this.server = server;
	}

	public JTextField getTxtIp() {
		return txtIp;
	}

	public JTextField getTxtPort() {
		return txtPort;
	}

	public ServerSocket getServer() {
		return server;
	}

	public ArrayList<ClientSocket> getClientsList() {
		return clients.getClients();
	}
	
	public ActiveClients getClients(){
		return clients;
	}
	
	public MessagesManager getMessagesManager() {
		return messagesManager;
	}


	public Thread getThrToMsgManager() {
		return thrToMsgManager;
	}

	

	/**
	 * Create the frame.
	 */
	public ServerFrame() {
		addWindowListener(new ServerClosingAction(this));
		
		setResizable(false);
		setTitle("Chattuu Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[63.00,grow][19.00][135.00][80px:100px,grow][][135px][70.00][100px:100px,grow]", "[grow][][][]"));
		
		initComponents();
		
		try {
			server = new ServerSocket(port);
			server.setSoTimeout(1000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("excepcion creando serverSocket");
		}
		clients = ActiveClients.getInstance();
		connectionsManager = ConnectionsManager.getManager(this);
		thrToConManager = new Thread(connectionsManager);	
		
		messagesManager = MessagesManager.getManager(this);
		thrToMsgManager = new Thread(messagesManager);
		
		thrToConManager.start();
		thrToMsgManager.start();
		
		
	}
	
	private void initComponents(){
		
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane, "cell 0 0 7 1,grow");
		
		txtrPrompt = new JTextArea();
		txtrPrompt.setForeground(new Color(255, 255, 255));
		txtrPrompt.setBackground(Color.BLACK);
		txtrPrompt.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtrPrompt.setEditable(false);
		txtrPrompt.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrPrompt.setWrapStyleWord(true);
		txtrPrompt.setLineWrap(true);
		scrollPane.setViewportView(txtrPrompt);
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 7 0 1 4,grow");
		
		list = new JList();
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setViewportView(list);
		
		btnErase = new JButton("Borrar");
		btnErase.setBorder(new CompoundBorder());
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 12));
		scrollPane_1.setColumnHeaderView(btnErase);
		
		lblIp = new JLabel("Ip");
		lblIp.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIp, "cell 1 2,alignx trailing,growy");
		
		txtIp = new JTextField();
		txtIp.setEditable(false);
		contentPane.add(txtIp, "cell 2 2,grow");
		txtIp.setColumns(10);
		
		lblPort = new JLabel("Port");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPort, "cell 4 2,alignx trailing,growy");
		
		txtPort = new JTextField();
		txtPort.setEditable(false);
		contentPane.add(txtPort, "cell 5 2,grow");
		txtPort.setColumns(10);
		txtPort.setText(Integer.toString(port));
		
	}

}
