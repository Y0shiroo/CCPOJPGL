package L1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PageOne extends JFrame {

	private JPanel PageOne;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageOne frame = new PageOne();
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
	public PageOne() {
		setTitle("PORTFOLIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 726);
		PageOne = new JPanel();
		PageOne.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PageOne);
		PageOne.setLayout(null);
	
	//ABOUT ME BUTTON
		JButton btnAboutMe = new JButton("ABOUT ME");
		btnAboutMe.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnAboutMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AboutMe ABT = new AboutMe();
			ABT.setVisible(true);
			dispose();
			}
		});
		btnAboutMe.setBounds(170, 555, 120, 61);
		PageOne.add(btnAboutMe);
	
	//INTERESTS BUTTON
		JButton btnInterests = new JButton("INTERESTS");
		btnInterests.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnInterests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interests INT = new Interests();
				INT.setVisible(true);
				dispose();
			}
		});
		btnInterests.setBounds(561, 555, 120, 61);
		PageOne.add(btnInterests);
	
	//EDUC BUTTON
		JButton btnEduc = new JButton("EDUCATION");
		btnEduc.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnEduc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Educ EDU = new Educ();
				EDU.setVisible(true);
				dispose();
			}
		});
		btnEduc.setBounds(430, 555, 120, 61);
		PageOne.add(btnEduc);
	//SKILLS BUTTON
		JButton btnSkills = new JButton("SKILL SET");
		btnSkills.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skills SKL = new Skills();
				SKL.setVisible(true);
				dispose();
			}
		});
		btnSkills.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnSkills.setBounds(300, 555, 120, 61);
		PageOne.add(btnSkills);
		
	//BACKGROUND
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTS2GFU9\\TITLE_PAGE[1].png"));
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setBounds(0, 0, 700, 700);
		PageOne.add(lblBackground);
	}
}
