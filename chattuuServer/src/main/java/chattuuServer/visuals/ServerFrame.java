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
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Properties;
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
	private int port = 0;
	private final static int DEFAULT_PORT = 0;
	private final static String KEY_PORT_CONFIG = "port";
	private final static String CONFIG_FILE_NAME = "config.properties";
	private ConnectionsManager connectionsManager;
	private Thread thrToConManager;
	private MessagesManager messagesManager;
	private Thread thrToMsgManager;
	public final static String MAGIC_WORD = "+*JEYMOICHATTUUFIN*+";

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

	/**
	 * Create the frame.
	 */
	public ServerFrame() {
		addWindowListener(new ServerClosingAction(this));
		
		setResizable(false);
		setTitle("Chattuu Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[63.00,grow][19.00][133.00][grow][][142.00][grow]", "[grow][][][]"));
		
		initComponents();
		
		
		Properties config = new Properties();
		try {
			config.load(new InputStreamReader(this.getClass().getResourceAsStream(CONFIG_FILE_NAME)));
		} catch (IOException e1) {
			port = DEFAULT_PORT;
		}
		
		
		try {
			server = new ServerSocket(port);
			server.setSoTimeout(1000);
		} catch (IOException e) {
			// TODO revisar
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
		
		lblIp = new JLabel("Ip");
		lblIp.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblIp, "cell 1 2,alignx trailing");
		
		txtIp = new JTextField();
		txtIp.setEditable(false);
		contentPane.add(txtIp, "cell 2 2,growx");
		txtIp.setColumns(10);
		
		lblPort = new JLabel("Port");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblPort, "cell 4 2,alignx trailing");
		
		txtPort = new JTextField();
		txtPort.setEditable(false);
		contentPane.add(txtPort, "cell 5 2,growx");
		txtPort.setColumns(10);
		txtPort.setText(Integer.toString(port));
		
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


}
