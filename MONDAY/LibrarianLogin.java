import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin {

	JFrame LibrarianloginFrame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin window = new LibrarianLogin();
					window.LibrarianloginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LibrarianloginFrame = new JFrame();
		LibrarianloginFrame.setBounds(100, 100, 925, 545);
		LibrarianloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibrarianloginFrame.getContentPane().setLayout(null);
		
		JLabel lblLibrarianLogin = new JLabel("LIBRARIAN LOGIN");
		lblLibrarianLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLibrarianLogin.setBounds(262, 49, 400, 35);
		LibrarianloginFrame.getContentPane().add(lblLibrarianLogin);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(148, 125, 215, 52);
		LibrarianloginFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(148, 195, 215, 52);
		LibrarianloginFrame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(380, 136, 192, 35);
		LibrarianloginFrame.getContentPane().add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(380, 206, 192, 35);
		LibrarianloginFrame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if (username.contains("Librarian_01")&& password.contains("LibrarianOne")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else if (username.contains("Librarian_02")&& password.contains("LibrarianTwo")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else if (username.contains("Librarian_03")&& password.contains("LibrarianThree")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					LibrarianBooks lb = new LibrarianBooks();
					lb.Booksframe.setVisible(true);
					LibrarianloginFrame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(198, 314, 165, 52);
		LibrarianloginFrame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login mf = new Login();
				mf.mainFrame.setVisible(true);
				LibrarianloginFrame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(497, 314, 165, 52);
		LibrarianloginFrame.getContentPane().add(btnBack);
	}

}
