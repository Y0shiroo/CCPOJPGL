import java.util.ArrayList;
import java.util.List;
public class Main {
List<Book> favorites = new ArrayList<Book>();
public void testBooks() {
	Book b1 = new Book ("title1", 11, false);
	Book b2 = new Book ("title2", 12, false);
	Book b3 = new Book ("title3", 13, false);
	
	List<Book> temp = new ArrayList<Book>();
	temp.add(b1);
	temp.add(b2);
	temp.add(b3);
	merge(temp);
}
public void merge(List<Book>listOfBooksFromTemp) {
	assert !listOfBooksFromTemp.isEmpty(): "is Empty";
	favorites.addAll(listOfBooksFromTemp);
	assert !favorites.isEmpty(): "favorite Empty";
}
}
