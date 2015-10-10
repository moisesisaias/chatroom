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

public class ChatFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmChattuu;

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

	/**
	 * Create the application.
	 */
	public ChatFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChattuu = new JFrame();
		frmChattuu.setTitle("Chattuu");
		frmChattuu.setMinimumSize(new Dimension(500, 350));
		frmChattuu.setBounds(100, 100, 500, 433);
		frmChattuu.setBounds(100, 100, 500, 300);
		frmChattuu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChattuu.getContentPane().setLayout(new MigLayout("", "[110px:150px:450px,grow][200px:250.00,grow][110px:110.00]", "[grow][70px:75px][70px:75px]"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuu.getContentPane().add(scrollPane_1, "cell 0 0 1 3,grow");
		
		JTextArea txtrLog = new JTextArea();
		txtrLog.setEditable(false);
		txtrLog.setLineWrap(true);
		txtrLog.setWrapStyleWord(true);
		txtrLog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setViewportView(txtrLog);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmChattuu.getContentPane().add(scrollPane, "cell 1 0 2 1,grow");
		
		JTextArea txtrMsglog = new JTextArea();
		txtrMsglog.setEditable(false);
		txtrMsglog.setLineWrap(true);
		txtrMsglog.setWrapStyleWord(true);
		txtrMsglog.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(txtrMsglog);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frmChattuu.getContentPane().add(scrollPane_2, "cell 1 1 1 2,grow");
		
		JTextArea txtrWritemsg = new JTextArea();
		txtrWritemsg.setLineWrap(true);
		txtrWritemsg.setWrapStyleWord(true);
		txtrWritemsg.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setViewportView(txtrWritemsg);
		
		JButton btnSend = new JButton("Enviar");
		btnSend.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuu.getContentPane().add(btnSend, "cell 2 1,grow");
		
		JButton btnDisconnect = new JButton("Desconectar");
		btnDisconnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frmChattuu.getContentPane().add(btnDisconnect, "cell 2 2,grow");
	}

}
