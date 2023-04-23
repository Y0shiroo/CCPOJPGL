import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AdminLogin {

    JFrame AdminloginFrame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.AdminloginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminloginFrame = new JFrame();
		AdminloginFrame.setBounds(100, 100, 988, 569);
		AdminloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminloginFrame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(148, 88, 215, 52);
		AdminloginFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(148, 179, 215, 52);
		AdminloginFrame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(355, 97, 192, 35);
		AdminloginFrame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(355, 188, 192, 35);
		AdminloginFrame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if (username.contains("Admin_01")&& password.contains("AdminOne")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
				} else if (username.contains("Admin_02")&& password.contains("AdminTwo")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
				} else if (username.contains("Admin_03")&& password.contains("AdminThree")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
				} else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(198, 290, 165, 52);
		AdminloginFrame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login mf = new Login();
				mf.mainFrame.setVisible(true);
				AdminloginFrame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(478, 290, 165, 52);
		AdminloginFrame.getContentPane().add(btnBack);
		
		JLabel lblAdmin = new JLabel("ADMIN LOGIN");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(243, 28, 400, 35);
		AdminloginFrame.getContentPane().add(lblAdmin);
	}
}
