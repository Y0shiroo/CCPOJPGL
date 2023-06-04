package L1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class AboutMe extends JFrame {

	private JPanel AboutMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
					frame.setVisible(true);
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
	public AboutMe() {
		setTitle("ABOUT ME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 730);
		AboutMe = new JPanel();
		AboutMe.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(AboutMe);
		AboutMe.setLayout(null);
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
		btnBack.setBounds(418, 28, 125, 40);
		AboutMe.add(btnBack);
		
		btnBack.setBounds(418, 28, 125, 40);
		AboutMe.add(btnBack);
		
		JLabel lbl1x1 = new JLabel("");
		lbl1x1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1x1.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\Downloads\\PORTFOLIO pics.png"));
		lbl1x1.setBounds(97, 215, 165, 165);
		lbl1x1.setVisible(false);
		AboutMe.add(lbl1x1);
	//PANEL WAS SET TO FALSE FOR THE SHOW BUTTON	
		JPanel InfoPanel = new JPanel();
		InfoPanel.setBackground(new Color(201, 201, 201));
		InfoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		InfoPanel.setForeground(new Color(148, 148, 148));
		InfoPanel.setBounds(326, 245, 237, 346);
		AboutMe.add(InfoPanel);
		InfoPanel.setLayout(null);
		InfoPanel.setVisible(false);
		
		JLabel lblName = new JLabel("NAME: MARC ANDREI J CADIZ");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblName.setBounds(39, 10, 160, 55);
		InfoPanel.add(lblName);
		
		JLabel lblBirthday = new JLabel("BIRTHDAY: AUGUST 7 2004");
		lblBirthday.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblBirthday.setBounds(39, 72, 160, 55);
		InfoPanel.add(lblBirthday);
		
		JLabel lblAge = new JLabel("AGE: 18 YEARS OLD");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblAge.setBounds(39, 137, 160, 55);
		InfoPanel.add(lblAge);
		
		JLabel lblGender = new JLabel("GENDER: MALE");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblGender.setBounds(39, 202, 160, 55);
		InfoPanel.add(lblGender);
		
		JLabel lblOccupation = new JLabel("OCCUPATION: STUDENT");
		lblOccupation.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblOccupation.setBounds(39, 267, 160, 55);
		InfoPanel.add(lblOccupation);
	//SHOW BUTTON AKA WHO AM I BUTTON	
		JButton btnWhoAmI = new JButton("WHO AM I?");
		btnWhoAmI.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnWhoAmI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoPanel.show();
				lbl1x1.setVisible(true);
			}
		});
		btnWhoAmI.setBounds(262, 28, 125, 40);
		AboutMe.add(btnWhoAmI);
	//BACKGROUND LAYOUT	
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\MA8P80D4\\P.INFO_(2)[1].png"));
		lblBackground.setBounds(0, 0, 700, 700);
		lblBackground.setVisible(true);
		AboutMe.add(lblBackground);
	}
}
