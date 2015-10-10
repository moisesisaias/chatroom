package chattuuClient.visuals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmChattuuLog;
	private JTextField txtIp;
	private JTextField txtPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmChattuuLog.setVisible(true);
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
		frmChattuuLog = new JFrame();
		frmChattuuLog.setTitle("Chattuu Log");
		frmChattuuLog.setResizable(false);
		frmChattuuLog.setBounds(100, 100, 500, 270);
		frmChattuuLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChattuuLog.getContentPane().setLayout(new MigLayout("", "[104.00][161.00][20.00][113.00][63.00]", "[20px][30px][20px][30px][20px][30px][20px][30px][20.00]"));
		
		JLabel lblTitle = new JLabel("Bienvenidos a Chattuu");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		frmChattuuLog.getContentPane().add(lblTitle, "cell 1 1 3 1,grow");
		
		JLabel lblIp = new JLabel("Ip Servidor");
		lblIp.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmChattuuLog.getContentPane().add(lblIp, "cell 0 3,alignx trailing,growy");
		
		txtIp = new JTextField();
		txtIp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuuLog.getContentPane().add(txtIp, "cell 1 3,grow");
		txtIp.setColumns(10);
		
		JButton btnConnect = new JButton("Conectar");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConnect.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuuLog.getContentPane().add(btnConnect, "cell 3 3,grow");
		
		JLabel lblPort = new JLabel("Puerto");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmChattuuLog.getContentPane().add(lblPort, "cell 0 5,alignx trailing,growy");
		
		txtPort = new JTextField();
		txtPort.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuuLog.getContentPane().add(txtPort, "cell 1 5,grow");
		txtPort.setColumns(10);
		
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuuLog.getContentPane().add(btnExit, "cell 3 5,grow");
		
		JTextArea txtrErrorlog = new JTextArea();
		txtrErrorlog.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtrErrorlog.setEditable(false);
		frmChattuuLog.getContentPane().add(txtrErrorlog, "cell 1 7 3 1,grow");
	}

}
