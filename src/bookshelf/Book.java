package bookshelf;

public class Book {
	private int barCode;
	private String name;
	private String publishing;
	private String author;
	private boolean read;
	
	public Book(int barCode, String name, String publishing,String author, boolean read) {
		this.barCode = barCode;
		this.name = name;
		this.publishing = publishing;
		this.author = author;
		this.read = read;
	}
	
	public int getBarCode() {
		return barCode;
	}
	public String getName() {
		return name;
	}
	public String getPublishing() {
		return publishing;
	}
	public String getAuthor() {
		return author;
	}
	public boolean getRead() {
		return read;
	}
	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
