package chattuuClient.visuals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;

public class ChatFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmChattuu;
	private JScrollPane scrollPane_1;
	private JTextArea txtrLog;
	private JScrollPane scrollPane;
	private JTextArea txtrMsglog;
	private JScrollPane scrollPane_2;
	private JTextArea txtrWritemsg;
	private JButton btnSend;
	private JButton btnDisconnect;
	private JFrame parent;
	private Socket clientSocket;
	
	//TODO: eliminir cuando se configure el inicio correcto
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatFrame window = new ChatFrame();
					window.frmChattuu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// TODO: eliminar cuando la app est� lista
	/**
	 * Create the application.
	 */
	public ChatFrame() {
		initialize();
	}
	
	public ChatFrame(JFrame parent, Socket clientSocket) {
		initialize();
		this.parent = parent;
		this.clientSocket = clientSocket;
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChattuu = new JFrame();
		frmChattuu.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			}
		});
		frmChattuu.setTitle("Chattuu");
		frmChattuu.setMinimumSize(new Dimension(500, 350));
		frmChattuu.setBounds(100, 100, 500, 433);
		frmChattuu.setBounds(100, 100, 500, 300);
		frmChattuu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChattuu.getContentPane().setLayout(new MigLayout("", "[110px:150px:450px,grow][200px:250.00,grow][110px:110.00]", "[grow][70px:75px][70px:75px]"));
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuu.getContentPane().add(scrollPane_1, "cell 0 0 1 3,grow");
		
		txtrLog = new JTextArea();
		txtrLog.setEditable(false);
		txtrLog.setLineWrap(true);
		txtrLog.setWrapStyleWord(true);
		txtrLog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setViewportView(txtrLog);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuu.getContentPane().add(scrollPane, "cell 1 0 2 1,grow");
		
		txtrMsglog = new JTextArea();
		txtrMsglog.setEditable(false);
		txtrMsglog.setLineWrap(true);
		txtrMsglog.setWrapStyleWord(true);
		txtrMsglog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(txtrMsglog);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frmChattuu.getContentPane().add(scrollPane_2, "cell 1 1 1 2,grow");
		
		txtrWritemsg = new JTextArea();
		txtrWritemsg.setLineWrap(true);
		txtrWritemsg.setWrapStyleWord(true);
		txtrWritemsg.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setViewportView(txtrWritemsg);
		
		btnSend = new JButton("Enviar");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSend.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuu.getContentPane().add(btnSend, "cell 2 1,grow");
		
		btnDisconnect = new JButton("Desconectar");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDisconnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuu.getContentPane().add(btnDisconnect, "cell 2 2,grow");
	}

}
