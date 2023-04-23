import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class WelcomeAdmin {

	JFrame welcomeframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeAdmin window = new WelcomeAdmin();
					window.welcomeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		welcomeframe = new JFrame();
		welcomeframe.setTitle("WELCOME");
		welcomeframe.setBounds(100, 100, 536, 304);
		welcomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to NU Library system!!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 34, 367, 111);
		welcomeframe.getContentPane().add(lblNewLabel);
	}
}
