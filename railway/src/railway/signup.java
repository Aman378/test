package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTable;

public class signup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 11, 72, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 12, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(299, 15, 65, 22);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(384, 16, 200, 20);
		frame.getContentPane().add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(92, 60, 65, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(171, 60, 65, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(253, 60, 65, 23);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setBounds(10, 64, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
	}
}
