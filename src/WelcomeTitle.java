import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import org.eclipse.swt.internal.ole.win32.IFont;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;

public class WelcomeTitle {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeTitle window = new WelcomeTitle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeTitle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 396, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblGuest = new JLabel("ยินดีต้อนรับ Guest, กรุณา Login เพื่อเข้าสู่ระบบ");
		lblGuest.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGuest.setBounds(10, 45, 360, 34);
		frame.getContentPane().add(lblGuest);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		textField.setBounds(109, 90, 161, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("ลงชื่อเข้าใช้งาน");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equalsIgnoreCase("1111")) {
					JOptionPane.showMessageDialog(frame, "Welcome, User UNDEFINED_1");
				}
				else if (textField.getText().equalsIgnoreCase("2222")) {
					JOptionPane.showMessageDialog(frame, "Welcome, User UNDEFINED_2");
				}
				else if (textField.getText().equalsIgnoreCase("3333")) {
					JOptionPane.showMessageDialog(frame, "Welcome, User UNDEFINED_3");
				}
				else if (textField.getText().equalsIgnoreCase("debug_mode")) {
					JFrame MainMenu = new JFrame("Main Menu");
					MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else if (!textField.getText().equalsIgnoreCase("1111") && !textField.getText().equalsIgnoreCase("2222") && !textField.getText().equalsIgnoreCase("3333") && (!textField.getText().equalsIgnoreCase("debug_mode"))){
					JOptionPane.showMessageDialog(frame, "Wrong Password");
				}
			}
		});
		button.setBounds(125, 121, 130, 34);
		frame.getContentPane().add(button);
	}
}
