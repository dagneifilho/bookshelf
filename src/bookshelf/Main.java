package bookshelf;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shelf shelf = new Shelf();
		ArrayList<Book> books = shelf.getBooks();
		for (Book book : books) {
			System.out.println(book.getName());
		}
	}

}
