package L1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Educ extends JFrame {

	private JPanel Educ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Educ frame = new Educ();
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
	public Educ() {
		setTitle("EDUCATIONAL BACKGROUND");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 730);
		Educ = new JPanel();
		Educ.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Educ);
		Educ.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Bell MT", Font.BOLD, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PageOne PGO = new PageOne();
				PGO.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(492, 10, 96, 45);
		Educ.add(btnBack);
		
		JPanel Educpanel = new JPanel();
		Educpanel.setBackground(new Color(201, 201, 201));
		Educpanel.setBounds(146, 228, 350, 350);
		Educ.add(Educpanel);
		Educpanel.setLayout(null);
		Educpanel.setVisible(false);
		
		JLabel lblTSBS = new JLabel("");
		lblTSBS.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\MA8P80D4\\5[1].png"));
		lblTSBS.setBounds(43, 28, 100, 100);
		Educpanel.add(lblTSBS);
		
		JLabel lblPCC = new JLabel("");
		lblPCC.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTXLNMF0\\6[1].png"));
		lblPCC.setBounds(226, 127, 100, 100);
		Educpanel.add(lblPCC);
		
		JLabel lblNU = new JLabel("");
		lblNU.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTS2GFU9\\7[1].png"));
		lblNU.setBounds(43, 227, 100, 100);
		Educpanel.add(lblNU);
		
		JLabel lblTSBSGS = new JLabel("THE SPRINGBRIDGE SCHOOL");
		lblTSBSGS.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblTSBSGS.setHorizontalAlignment(SwingConstants.CENTER);
		lblTSBSGS.setBounds(168, 28, 172, 35);
		Educpanel.add(lblTSBSGS);
		
		JLabel lblPCCHS = new JLabel("PASIG CATHOLIC COLLEGE");
		lblPCCHS.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCCHS.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblPCCHS.setBounds(44, 133, 172, 35);
		Educpanel.add(lblPCCHS);
		
		JLabel lblNUMCL = new JLabel("NATIONAL UNIVERSITY MANILA");
		lblNUMCL.setHorizontalAlignment(SwingConstants.CENTER);
		lblNUMCL.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNUMCL.setBounds(154, 231, 186, 35);
		Educpanel.add(lblNUMCL);
		
		JLabel lblTSBSDates = new JLabel("2010 - 2016");
		lblTSBSDates.setHorizontalAlignment(SwingConstants.CENTER);
		lblTSBSDates.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblTSBSDates.setBounds(168, 62, 172, 55);
		Educpanel.add(lblTSBSDates);
		
		JLabel lblPCCDates = new JLabel("2016 - 2022");
		lblPCCDates.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCCDates.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblPCCDates.setBounds(43, 162, 172, 55);
		Educpanel.add(lblPCCDates);
		
		JLabel lblNUMDates = new JLabel("CURRENT");
		lblNUMDates.setHorizontalAlignment(SwingConstants.CENTER);
		lblNUMDates.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNUMDates.setBounds(168, 272, 172, 55);
		Educpanel.add(lblNUMDates);
		
		JButton btnShowStudy = new JButton("WHERE DID YOU STUDY?");
		btnShowStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Educpanel.setVisible(true);
			}
		});
		btnShowStudy.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnShowStudy.setBounds(292, 10, 165, 45);
		Educ.add(btnShowStudy);
		
		JLabel lblBackgroundEduc = new JLabel("");
		lblBackgroundEduc.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTS2GFU9\\EDUCNOTEXT[1].png"));
		lblBackgroundEduc.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundEduc.setBounds(0, 0, 700, 700);
		Educ.add(lblBackgroundEduc);
	}
}
