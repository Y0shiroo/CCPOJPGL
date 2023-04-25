import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Font;
public class Login {

	JFrame mainFrame;
	private final Action action = new SwingAction();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 1035, 590);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JButton LibrarianBtn = new JButton("Librarian Login");
		LibrarianBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin ll = new LibrarianLogin();
				ll.LibrarianloginFrame.setVisible(true);
				mainFrame.dispose();
			}
		});
		LibrarianBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		LibrarianBtn.setBounds(379, 308, 284, 67);
		mainFrame.getContentPane().add(LibrarianBtn);
		
		JButton AdminBtn = new JButton("Admin Login");
		AdminBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adm = new AdminLogin();
				adm.AdminloginFrame.setVisible(true);
				mainFrame.dispose();
			}
		});
		AdminBtn.setBounds(379, 193, 284, 67);
		mainFrame.getContentPane().add(AdminBtn);
		
		JLabel libmanLabel = new JLabel("LIBRARY MANAGEMENT");
		libmanLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		libmanLabel.setHorizontalAlignment(SwingConstants.CENTER);
		libmanLabel.setBounds(262, 51, 522, 67);
		mainFrame.getContentPane().add(libmanLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
