package bookshelf;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Shelf {
	private ArrayList<Book> books;
	private File file;
	public ArrayList<Book> getBooks(){
		return books;
	}
	
	public Shelf() {
		try {
			file = new File("shelf.txt");
			if(!file.createNewFile()) {
				try {
					books = new ArrayList<>();
					Scanner myReader = new Scanner(file);
					while(myReader.hasNextLine()) {
						String data = myReader.nextLine();
						String[] splitData = data.split(",");
						String name = splitData[0];
						String author = splitData[1];
						String publishing = splitData[2];
						boolean read = Boolean.parseBoolean(splitData[3]);
						int barCode = Integer.parseInt(splitData[4]);
						Book book = new Book(barCode, name, publishing, author, read);
						books.add(book);
					}
					
					myReader.close();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				
			} else {
				System.out.println("File created.");
			}
		}
		catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public void addBook(Book book){
		
		String append = "" + book.getName() + "," + book.getAuthor() + ","+book.getPublishing()
							+","+ book.getRead() + "," + book.getBarCode()+"\n";
		try {
			FileWriter myWriter = new FileWriter(file,true);
			myWriter.write(append);			
			myWriter.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		finally {
			books.add(book);
		}
	}
	

	
	

}
