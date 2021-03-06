package chattuuServer.visuals;

import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.io.IOException;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ServerFrame frameInstance = new ServerFrame();
	private JPanel contentPane;
	private JTextField txtIp;
	private JTextField txtPort;
	private ServerSocket server;
	private ActiveClients clients;
	private JScrollPane scrollPane;
	private JTextArea txtrPrompt;
	private JLabel lblIp;
	private JLabel lblPort;
	private int port = 66000;
	private final static int DEFAULT_PORT = 0;
	private final static String KEY_PORT_CONFIG = "port";
	private final static String CONFIG_FILE_NAME = "config.properties";
	private ConnectionsManager connectionsManager;
	private Thread thrToConManager;
	private MessagesManager messagesManager;
	private Thread thrToMsgManager;
	public final static String MAGIC_WORD = "+*JEYMOICHATTUUFIN*+";
	private JButton btnRetry;

	/**
	 * Create the frame.
	 */
	private ServerFrame() {
		addWindowListener(new ServerClosingAction(this));

		setResizable(false);
		setTitle("Chattuu Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[40.00,grow][30.00][116.00][40.00,grow][40.00px][80.00][40.00,grow][90px][40.00,grow]", "[grow][][][]"));

		initComponents();
		loadPort();
		startServer();

	}
	
	private void loadPort(){
		Properties config = new Properties();
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			config.load(loader.getResourceAsStream(CONFIG_FILE_NAME));

			String strPort = config.getProperty(KEY_PORT_CONFIG);
			
			if (strPort != null) {
				port = Integer.parseInt(strPort);
			} else {
				throw new IOException("Puerto no encontrado en propiedades");
			}
			
			if(port < 0 || port > 65000){
				throw new IOException("Puerto: "+port+ "invalido. Esta fuera de los margenes");
			}
		} catch (IOException e1) {
			txtrPrompt.append(e1.getMessage());
			port = DEFAULT_PORT;
		}
		txtPort.setText(Integer.toString(port));
		
	}
	
	private void startServer(){
		try {
			server = new ServerSocket(port);
			
			port = server.getLocalPort();
			txtPort.setText(Integer.toString(port));
			
			server.setSoTimeout(1000);
			
			clients = ActiveClients.getInstance();
			
			connectionsManager = ConnectionsManager.getManager(this);
			thrToConManager = new Thread(connectionsManager);

			messagesManager = MessagesManager.getManager(this);
			thrToMsgManager = new Thread(messagesManager);

			thrToConManager.start();
			thrToMsgManager.start();
			
			txtIp.setText(ConnectionsManager.displayInterfaceInformation());
			btnRetry.setEnabled(false);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Excepcion creando serverSocket");
			txtrPrompt.append("Excepcion creando serverSocket, "+e.getMessage()+". Cierre y eliga otro puerto o presione reintentar para ");
			btnRetry.setEnabled(true);
		}
		
		
	}

	private void initComponents() {

		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane, "cell 0 0 9 1,grow");

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
				txtPort.setText(Integer.toString(0));
				
				btnRetry = new JButton("Reintentar");
				btnRetry.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						port = DEFAULT_PORT;
						startServer();
					}
				});
				btnRetry.setEnabled(false);
				contentPane.add(btnRetry, "cell 7 2,grow");

	}
	
	public static ServerFrame getFrameInstance() {
		return frameInstance;
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

	public ActiveClients getClients() {
		return clients;
	}

	public MessagesManager getMessagesManager() {
		return messagesManager;
	}

	public Thread getThrToMsgManager() {
		return thrToMsgManager;
	}
	
	public JButton getBtnRetry() {
		return btnRetry;
	}

}
