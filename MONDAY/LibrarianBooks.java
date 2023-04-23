import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LibrarianBooks {

	JFrame Booksframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianBooks window = new LibrarianBooks();
					window.Booksframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianBooks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Booksframe = new JFrame();
		Booksframe.setTitle("BOOKS");
		Booksframe.setBounds(100, 100, 857, 483);
		Booksframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Booksframe.getContentPane().setLayout(null);
		
		JLabel AvailBooks = new JLabel("AVAILABLE BOOKS");
		AvailBooks.setFont(new Font("Tahoma", Font.BOLD, 30));
		AvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		AvailBooks.setBounds(228, 10, 369, 76);
		Booksframe.getContentPane().add(AvailBooks);
		
		JLabel Book1 = new JLabel("The Hunger Games");
		Book1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Book1.setHorizontalAlignment(SwingConstants.CENTER);
		Book1.setBounds(46, 168, 232, 56);
		Booksframe.getContentPane().add(Book1);
		
		JLabel Book2 = new JLabel("The Fault in Our Stars");
		Book2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Book2.setHorizontalAlignment(SwingConstants.CENTER);
		Book2.setBounds(46, 234, 232, 56);
		Booksframe.getContentPane().add(Book2);
		
		JLabel Book3 = new JLabel("The Shining");
		Book3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Book3.setHorizontalAlignment(SwingConstants.CENTER);
		Book3.setBounds(46, 315, 232, 56);
		Booksframe.getContentPane().add(Book3);
		
		JLabel Author1 = new JLabel("Suzanne Collins");
		Author1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1.setBounds(297, 168, 232, 56);
		Booksframe.getContentPane().add(Author1);
		
		JLabel Author2 = new JLabel("Suzanne Collins");
		Author2.setHorizontalAlignment(SwingConstants.CENTER);
		Author2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author2.setBounds(297, 234, 232, 56);
		Booksframe.getContentPane().add(Author2);
		
		JLabel Author3 = new JLabel("Stephen King");
		Author3.setHorizontalAlignment(SwingConstants.CENTER);
		Author3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author3.setBounds(297, 315, 232, 56);
		Booksframe.getContentPane().add(Author3);
		
		JLabel Author1_1 = new JLabel("1");
		Author1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_1.setBounds(558, 168, 232, 56);
		Booksframe.getContentPane().add(Author1_1);
		
		JLabel Author1_2 = new JLabel("3");
		Author1_2.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_2.setBounds(558, 234, 232, 56);
		Booksframe.getContentPane().add(Author1_2);
		
		JLabel Author1_3 = new JLabel("7");
		Author1_3.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_3.setBounds(558, 315, 232, 56);
		Booksframe.getContentPane().add(Author1_3);
		
		JLabel lblBookTitles = new JLabel("BOOK TITLES :");
		lblBookTitles.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookTitles.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBookTitles.setBounds(46, 102, 232, 56);
		Booksframe.getContentPane().add(lblBookTitles);
		
		JLabel lblAuthors = new JLabel("AUTHORS :");
		lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthors.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAuthors.setBounds(288, 102, 232, 56);
		Booksframe.getContentPane().add(lblAuthors);
		
		JLabel lblNumOfCompies = new JLabel("NUM. OF COMPIES :");
		lblNumOfCompies.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumOfCompies.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNumOfCompies.setBounds(539, 102, 232, 56);
		Booksframe.getContentPane().add(lblNumOfCompies);
	}

}
