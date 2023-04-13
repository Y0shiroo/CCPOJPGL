import java.util.Scanner;
class Book {
    public String title;
    public String author;
    public int yearPublished;
    public int Copies;

    public Book(String title, String author, int yearPublished, int Copies) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.Copies = Copies;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public int getCopies() {
        return Copies;
    }
    public void setCopies(int Copies) {
        this.Copies = Copies;
    }
    public boolean isAvailable() {
        return Copies > 0;
    }
    public void borrow() {
        Copies--;
    }
    public void returnBook() {
        Copies++;
    }
}
public class Main {
    public static void main(String[] args) {
        BookRental system = new BookRental();
        system.run();
    }
}
