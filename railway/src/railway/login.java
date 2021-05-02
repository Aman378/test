package railway;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField textField;
	static Connection con;
	static Statement st;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_world", "root", "aman2001");
			st = con.createStatement();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(22, 22, 111, 30);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(185, 22, 187, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 78, 111, 30);
		frame.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(185, 83, 187, 30);
		frame.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					try {
						ResultSet rs = st
								.executeQuery("Select * from users where usernm = '" + textField.getText() + "';");
						String sk = "";
						while (rs.next()) {
							sk = rs.getString("pass");
						}
						char p[] = sk.toCharArray();
						char pass[] = passwordField.getPassword();
						if (Arrays.equals(pass, p)) {
							System.out.println("correct");
						} else
							System.out.println("incorrect");
						Arrays.fill(pass,'0');
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
			}
		});
		btnNewButton.setBounds(185, 134, 136, 30);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewUserRegister = new JButton("New User? Register");
		btnNewUserRegister.setBounds(185, 185, 136, 30);
		frame.getContentPane().add(btnNewUserRegister);

	}
}
