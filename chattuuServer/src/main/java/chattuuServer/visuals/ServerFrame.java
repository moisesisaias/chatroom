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

import controller.ClientSocket;
import controller.ConnectionsManager;

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
	public JTextArea getTxtrPrompt() {
		return txtrPrompt;
	}

	public void setServer(ServerSocket server) {
		this.server = server;
	}

	private ArrayList<ClientSocket> clients;
	private JScrollPane scrollPane;
	private JTextArea txtrPrompt;
	private JLabel lblIp;
	private JLabel lblPort;
	private int port = 30000;

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
	
	public JTextField getTxtIp() {
		return txtIp;
	}

	public JTextField getTxtPort() {
		return txtPort;
	}

	public ServerSocket getServer() {
		return server;
	}

	public ArrayList<ClientSocket> getClients() {
		return clients;
	}

	/**
	 * Create the frame.
	 */
	public ServerFrame() {
		setResizable(false);
		setTitle("Chattuu Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[63.00,grow][19.00][133.00][grow][][142.00][grow]", "[grow][][][]"));
		
		initComponents();
		
		try {
			server = new ServerSocket(port);
			server.setSoTimeout(5000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("excepcion creando serverSocket");
		}
		clients = new ArrayList<ClientSocket>();
		ConnectionsManager connectionsManager = ConnectionsManager.getManager(this);
		Thread manager = new Thread(connectionsManager);	
		
		manager.start();
		
		
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

}
