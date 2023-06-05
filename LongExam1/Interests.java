package L1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Interests extends JFrame {

	private JPanel Interests;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interests frame = new Interests();
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
	public Interests() {
		setTitle("INTERESTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 730);
		Interests = new JPanel();
		Interests.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Interests);
		Interests.setLayout(null);
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
		btnBack.setBounds(536, 21, 100, 33);
		Interests.add(btnBack);
	//PANEL WAS SET TO FALSE FOR THE SHOW BUTTON			
		JPanel Interestspanel = new JPanel();
		Interestspanel.setBackground(new Color(199, 199, 199));
		Interestspanel.setBorder(null);
		Interestspanel.setBounds(157, 166, 400, 400);
		Interests.add(Interestspanel);
		Interestspanel.setLayout(null);
		Interestspanel.setVisible(false);
		
	//LABELS FOR PICTURES AND OTHER INFORMATION
		JLabel lblF_Ficon = new JLabel("");
		lblF_Ficon.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTXLNMF0\\2[1].png"));
		lblF_Ficon.setHorizontalAlignment(SwingConstants.CENTER);
		lblF_Ficon.setBounds(53, 61, 100, 100);
		Interestspanel.add(lblF_Ficon);
		
		JLabel lblBlondeicon = new JLabel("");
		lblBlondeicon.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\KO42U40N\\3[1].png"));
		lblBlondeicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlondeicon.setBounds(239, 61, 100, 100);
		Interestspanel.add(lblBlondeicon);
		
		JLabel lblValorant = new JLabel("");
		lblValorant.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\HTS2GFU9\\4[1].png"));
		lblValorant.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorant.setBounds(148, 222, 100, 100);
		Interestspanel.add(lblValorant);
		
		JLabel lblMovies = new JLabel("MOVIES");
		lblMovies.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovies.setBounds(75, 171, 75, 30);
		Interestspanel.add(lblMovies);
		
		JLabel lblMusic = new JLabel("MUSIC");
		lblMusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusic.setBounds(249, 171, 75, 30);
		Interestspanel.add(lblMusic);
		
		JLabel lblGames = new JLabel("GAMES");
		lblGames.setHorizontalAlignment(SwingConstants.CENTER);
		lblGames.setBounds(158, 333, 75, 30);
		Interestspanel.add(lblGames);
	//SHOW BUTTON AKA WHAT ARE YOU INTERESTED IN BUTTON
		JButton btnWhatAreYou = new JButton("WHAT ARE YOU INTERESTED IN?");
		btnWhatAreYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interestspanel.setVisible(true);
			}
		});
		btnWhatAreYou.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnWhatAreYou.setBounds(310, 21, 199, 33);
		Interests.add(btnWhatAreYou);
		
	//BACKGROUND
		JLabel lblBackground = new JLabel("");
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setIcon(new ImageIcon("C:\\Users\\Marc Cadiz\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\KO42U40N\\INTERESTSNOTEXT[1].png"));
		lblBackground.setBounds(0, 0, 700, 700);
		Interests.add(lblBackground);
	}
}
