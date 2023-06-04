package L1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Skills extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Skills() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	// BACK TO PAGE ONE BUTTON
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageOne PGO = new PageOne();
				PGO.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(498, 10, 125, 40);
		contentPane.add(btnBack);
	//PANEL WAS SET TO FALSE FOR THE SHOW BUTTON
		JPanel Skillspanel = new JPanel();
		Skillspanel.setBackground(new Color(192, 192, 192));
		Skillspanel.setBounds(41, 148, 521, 457);
		contentPane.add(Skillspanel);
		Skillspanel.setLayout(null);
		Skillspanel.setVisible(false);
		
		JLabel lblProgLang = new JLabel("Programming Language:");
		lblProgLang.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblProgLang.setBounds(26, 21, 150, 25);
		Skillspanel.add(lblProgLang);
		
		JLabel lblOperatingSystems = new JLabel("Operating Systems:");
		lblOperatingSystems.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblOperatingSystems.setBounds(26, 87, 150, 25);
		Skillspanel.add(lblOperatingSystems);
		
		JLabel lblDevelopingWebsites = new JLabel("Developing Websites:");
		lblDevelopingWebsites.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDevelopingWebsites.setBounds(26, 165, 150, 25);
		Skillspanel.add(lblDevelopingWebsites);
		
		JLabel lblAdaptability = new JLabel("Adaptability:");
		lblAdaptability.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAdaptability.setBounds(26, 235, 150, 25);
		Skillspanel.add(lblAdaptability);
		
		JLabel lblCollaboration = new JLabel("Collaboration:");
		lblCollaboration.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCollaboration.setBounds(26, 305, 150, 25);
		Skillspanel.add(lblCollaboration);
		
		JLabel lblCommunication = new JLabel("Communication:");
		lblCommunication.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCommunication.setBounds(26, 382, 150, 25);
		Skillspanel.add(lblCommunication);
		
		JLabel lblPriorKnowledge = new JLabel("- Has prior knowledge of Java, HTML, and Python language.");
		lblPriorKnowledge.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblPriorKnowledge.setBounds(26, 42, 385, 50);
		Skillspanel.add(lblPriorKnowledge);
		
		JLabel lblKnowledgeOf = new JLabel("- Knowledge of troubleshooting operating systems.");
		lblKnowledgeOf.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblKnowledgeOf.setBounds(26, 115, 385, 50);
		Skillspanel.add(lblKnowledgeOf);
		
		JLabel lblFamiliarWith = new JLabel("- Familiar with designing and developing responsive websites with the use of HTML");
		lblFamiliarWith.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblFamiliarWith.setBounds(26, 187, 385, 50);
		Skillspanel.add(lblFamiliarWith);
		
		JLabel lblOpenTo = new JLabel("- Open to new ideas, embraces change, and quickly adjusts to new environments and situations.");
		lblOpenTo.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblOpenTo.setBounds(26, 258, 485, 50);
		Skillspanel.add(lblOpenTo);
		
		JLabel lblAbleTo = new JLabel("- Able to collaborate with others, actively contribute idea, and value diverse perspectives to achieve shared goals.");
		lblAbleTo.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		lblAbleTo.setBounds(26, 328, 485, 50);
		Skillspanel.add(lblAbleTo);
		
		JLabel lblCanEffectively = new JLabel("- Proficient in adaptable communication, conveying information effectively through active listening, clarity, and empathy.");
		lblCanEffectively.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		lblCanEffectively.setBounds(26, 401, 485, 56);
		Skillspanel.add(lblCanEffectively);
	//SHOW BUTTON AKA WHAT ARE YOUR SKILLS BUTTON	
		JButton btnShowSkills = new JButton("WHAT ARE YOUR SKILLS?");
		btnShowSkills.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnShowSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skillspanel.setVisible(true);
			}
		});
		btnShowSkills.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnShowSkills.setBounds(286, 10, 202, 40);
		contentPane.add(btnShowSkills);
	//BACKGROUND	
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\KO42U40N\\SKILLSET_(1)[1].png"));
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setBounds(0, 0, 700, 700);
		contentPane.add(lblBackground);
	}
}
