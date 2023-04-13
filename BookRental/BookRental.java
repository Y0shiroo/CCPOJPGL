import java.util.Scanner;
class BookRental {
    public Book[] books;
    public BookRental() {
        books = new Book[] {
            new Book("System Analysis and Design", "Gary B. Shelly", 2000, 2),
            new Book("Android Application Development", "Corrine Hoisington", 2000, 3),
            new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 2000, 4)};
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
            System.out.println("*************************");
            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + ". " + books[i].getTitle() + " by " + books[i].getAuthor() + books[i].getCopies() + " available");
            }
            System.out.println("*************************");
            System.out.print("Choose a number to rent your favorite book: ");
            int index = scanner.nextInt();
            if (index < 1 || index > books.length) {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
                continue;
            }
            Book book = books[index - 1];
            if (!book.isAvailable()) {
                System.out.println("All copies of " + book.getTitle() + " are currently borrowed. Please select another book.");
                continue;       
            }
            book.borrow();
            System.out.println("You have successfully borrowed " + book.getTitle() + " by " + book.getAuthor() + ".");
            System.out.println("There are now " + book.getCopies() + " copies available.");
            if (allCopiesBorrowed()) {
                System.out.println("All books have been borrowed. Exiting program.");
                break;
            }
        }
    }
    private boolean allCopiesBorrowed() {
        for (Book book : books) {
            if (book.isAvailable()) {
                return false;
            }
        }
        return true;
    }
}
