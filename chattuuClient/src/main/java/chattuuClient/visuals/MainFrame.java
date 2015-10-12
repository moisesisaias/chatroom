package chattuuClient.visuals;

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

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainFrame frameInstance = new MainFrame();
	private JFormattedTextField txtIp;
	private JTextField txtPort;
	private JLabel lblTitle;
	private JLabel lblIp;
	private JButton btnConnect;
	private JLabel lblPort;
	private JButton btnExit;
	private JTextArea txtrErrorlog;
	private MaskFormatter mask;
	private JLabel lblUsername;
	private JTextField txtUserName;

	/**
	 * Create the application.
	 */
	private MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Chattuu Log");
		setResizable(false);
		setBounds(100, 100, 550, 370);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[69.00][78.00][161.00,grow][20.00][113.00][63.00]", 
				"[20px][30px][20px][30px:30px][20px][30px][20px][30px][20px][75.00px][20.00]"));

		lblTitle = new JLabel("Bienvenidos a Chattuu");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTitle, "cell 1 1 4 1,grow");
		
		lblUsername = new JLabel("Nombre de \r\nusuario");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().add(lblUsername, "cell 1 3,alignx trailing,aligny baseline");
		
		txtUserName = new JTextField();
		txtUserName.setFocusTraversalKeysEnabled(false);
		txtUserName.setFocusable(true);
		txtUserName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtIp.requestFocusInWindow();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_TAB) {
					txtIp.requestFocusInWindow();
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
		
				btnConnect = new JButton("Conectar");
				btnConnect.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode() == KeyEvent.VK_TAB) {
							btnExit.requestFocusInWindow();
						}
					}
				});
				btnConnect.setFocusTraversalKeysEnabled(false);
				// TODO: aquí se hace la conexión
				btnConnect.addActionListener(new ActionConnect(this));
				btnConnect.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				getContentPane().add(btnConnect, "cell 4 3 1 2,grow");

			
		lblIp = new JLabel("Ip Servidor");
		lblIp.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(lblIp, "cell 1 5,alignx trailing,growy");
		
		try {
			mask = new MaskFormatter("###.###.###.###");
			mask.setPlaceholderCharacter('0');
			mask.setPlaceholder("000.000.000.000");
		} catch (ParseException e1) {
			mask = null;
			e1.printStackTrace();
		}

		if (mask != null) {
			txtIp = new JFormattedTextField(mask);
			txtIp.setFocusable(true);
			txtIp.setFocusTraversalKeysEnabled(false);
			txtIp.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txtPort.requestFocusInWindow();
					}
					
					if(e.getKeyCode() == KeyEvent.VK_TAB) {
						txtPort.requestFocusInWindow();
					}
					
				}
			});
		} else {
			txtIp = new JFormattedTextField();
			txtIp.setFocusable(true);
			txtIp.setFocusTraversalKeysEnabled(false);
		}
		// TODO: ver si se sepaara en clase
		txtIp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtPort.requestFocusInWindow();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_TAB) {
					txtPort.requestFocusInWindow();
				}
				
			}
		});
		txtIp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(txtIp, "cell 2 5,grow");
		txtIp.setColumns(10);
		
				btnExit = new JButton("Salir");
				btnExit.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode() == KeyEvent.VK_TAB) {
							txtUserName.requestFocusInWindow();
						}
					}
				});
				btnExit.setFocusTraversalKeysEnabled(false);
				
				btnExit.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						close();
						
					}
				});
				btnExit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				getContentPane().add(btnExit, "cell 4 6 1 2,grow");

		lblPort = new JLabel("Puerto");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(lblPort, "cell 1 7,alignx trailing,growy");

		txtPort = new JTextField();
		txtPort.setFocusTraversalKeysEnabled(false);
		txtPort.setFocusable(true);
		// TODO: separar en otra clase
		txtPort.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnConnect.doClick();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_TAB){
					btnConnect.requestFocusInWindow();
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
		getContentPane().add(txtPort, "cell 2 7,grow");
		txtPort.setColumns(10);

		txtrErrorlog = new JTextArea();
		txtrErrorlog.setLineWrap(true);
		txtrErrorlog.setWrapStyleWord(true);
		txtrErrorlog.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtrErrorlog.setEditable(false);
		getContentPane().add(txtrErrorlog, "cell 1 9 4 1,grow");
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{
				txtUserName, txtIp, txtPort, btnConnect, btnExit}));
	}
	
	private void close() {
		int n = JOptionPane.showConfirmDialog(this,
				"Seguro desea cerrar Chatuu?", "Cerrar Chat",
				JOptionPane.YES_NO_OPTION);
		if (n == 0) {
			this.dispose();
		}
	}
	
	public static MainFrame getInstace() {
		return frameInstance;
	}

	public JTextField getTxtUserName() {
		return txtUserName;
	}
	
	public JTextField getTxtIp() {
		return txtIp;
	}

	public JTextField getTxtPort() {
		return txtPort;
	}

	public JTextArea getTxtrErrorlog() {
		return txtrErrorlog;
	}
	
}
