package chattuuClient.visuals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.MaskFormatter;

import chattuuClient.controller.ActionConnect;
import chattuuClient.model.ClientSocket;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// TODO: usando extends, para usar atributo debe quitar el extends
	// private JFrame frmChattuuLog;
	private JFormattedTextField txtIp;
	private JTextField txtPort;
	private JLabel lblTitle;
	private JLabel lblIp;
	private JButton btnConnect;
	private JLabel lblPort;
	private JButton btnExit;
	private JTextArea txtrErrorlog;
	// TODO:  verificar si es necesario aquí, las dos variables siguentes
	private ClientSocket clientSocket;
	private ChatFrame chat;
	private MaskFormatter mask;
	private JLabel lblUsername;
	private JTextField txtUserName;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					// window.frmChattuuLog.setVisible(true);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frmChattuuLog = new JFrame();
		// frmChattuuLog.setTitle("Chattuu Log");
		setTitle("Chattuu Log");
		// frmChattuuLog.setResizable(false);
		setResizable(false);
		// frmChattuuLog.setBounds(100, 100, 500, 270);
		setBounds(100, 100, 550, 370);
		// frmChattuuLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frmChattuuLog.getContentPane().setLayout(new MigLayout("",
		// "[104.00][161.00][20.00][113.00][63.00]",
		// "[20px][30px][20px][30px][20px][30px][20px][30px][20.00]"));
		getContentPane().setLayout(new MigLayout("", "[69.00][78.00][161.00,grow][20.00][113.00][63.00]", "[20px][30px][20px][30px:30px][20px][30px][20px][30px][20px][75.00px][20.00]"));

		lblTitle = new JLabel("Bienvenidos a Chattuu");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		// frmChattuuLog.getContentPane().add(lblTitle, "cell 1 1 3 1,grow");
		getContentPane().add(lblTitle, "cell 1 1 4 1,grow");
		
		lblUsername = new JLabel("Nombre de \r\nusuario");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblUsername, "cell 1 3,alignx trailing,aligny baseline");
		
				btnConnect = new JButton("Conectar");
				// TODO: aquí se hace la conección
				btnConnect.addActionListener(new ActionConnect(this));
				
				txtUserName = new JTextField();
				txtUserName.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.getKeyCode() == KeyEvent.VK_ENTER) {
							txtIp.grabFocus();
						}
						if(e.getKeyCode() == KeyEvent.VK_TAB) {
							txtIp.grabFocus();
						}
					}
					@Override
					public void keyTyped(KeyEvent e) {
						char key = e.getKeyChar();
						if (!Character.isAlphabetic(key)) {
							if(!Character.isSpaceChar(key)) {
								e.consume();
							}
						}
					}
				});
				txtUserName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				getContentPane().add(txtUserName, "cell 2 3,grow");
				txtUserName.setColumns(10);
				btnConnect.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				//frmChattuuLog.getContentPane().add(btnConnect, "cell 3 3,grow");
				getContentPane().add(btnConnect, "cell 4 3 1 2,grow");

			
		lblIp = new JLabel("Ip Servidor");
		lblIp.setFont(new Font("Tahoma", Font.BOLD, 11));
		//frmChattuuLog.getContentPane().add(lblIp, "cell 0 3,alignx trailing,growy");
		getContentPane().add(lblIp, "cell 1 5,alignx trailing,growy");
		
		try {
			mask = new MaskFormatter("###.###.###.###");
			mask.setPlaceholderCharacter('0');
			mask.setPlaceholder("000.000.000.000");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			mask = null;
			e1.printStackTrace();
		}

		if (mask != null) {
			txtIp = new JFormattedTextField(mask);
			txtIp.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txtPort.grabFocus();
					}
				}
			});
		} else {
			txtIp = new JFormattedTextField();
		}
		// TODO: ver si se sepaara en clase
		txtIp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtPort.grabFocus();
				}
				if(e.getKeyCode() == KeyEvent.VK_TAB) {
					txtPort.grabFocus();
				}
			}
		});
		txtIp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//frmChattuuLog.getContentPane().add(txtIp, "cell 1 3,grow");
		getContentPane().add(txtIp, "cell 2 5,grow");
		txtIp.setColumns(10);
		
				btnExit = new JButton("Salir");
				
				
				btnExit.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						close();
						
					}
				});
				btnExit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				// frmChattuuLog.getContentPane().add(btnExit, "cell 3 5,grow");
				getContentPane().add(btnExit, "cell 4 6 1 2,grow");

		lblPort = new JLabel("Puerto");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 11));
		// frmChattuuLog.getContentPane().add(lblPort, "cell 0 5,alignx trailing,growy");
		getContentPane().add(lblPort, "cell 1 7,alignx trailing,growy");

		txtPort = new JTextField();
		// TODO: separar en otra clase
		txtPort.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnConnect.doClick();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_TAB){
					btnConnect.grabFocus();
				}

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				char key = arg0.getKeyChar();
				if (!Character.isDigit(key)) {

					arg0.consume();
				}
			}
		});
		txtPort.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//frmChattuuLog.getContentPane().add(txtPort, "cell 1 5,grow");
		getContentPane().add(txtPort, "cell 2 7,grow");
		txtPort.setColumns(10);

		txtrErrorlog = new JTextArea();
		txtrErrorlog.setLineWrap(true);
		txtrErrorlog.setWrapStyleWord(true);
		txtrErrorlog.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtrErrorlog.setEditable(false);
		//frmChattuuLog.getContentPane().add(txtrErrorlog, "cell 1 7 3 1,grow");
		getContentPane().add(txtrErrorlog, "cell 1 9 4 1,grow");
	}
	
	private void close() {
		int n = JOptionPane.showConfirmDialog(this,
				"Seguro desea cerrar Chatuu?", "Cerrar Chat",
				JOptionPane.YES_NO_OPTION);
		if (n == 0) {
			// TODO: revisar cuando se ponga la app a iniciar por la interfaz
			this.dispose();
		}
	}

	public synchronized JTextField getTxtUserName() {
		return txtUserName;
	}
	
	public synchronized JTextField getTxtIp() {
		return txtIp;
	}

	public synchronized JTextField getTxtPort() {
		return txtPort;
	}

	public synchronized JTextArea getTxtrErrorlog() {
		return txtrErrorlog;
	}

	protected ClientSocket getClientSocket() {
		return clientSocket;
	}

	
	protected ChatFrame getChat() {
		return chat;
	}

	
}
