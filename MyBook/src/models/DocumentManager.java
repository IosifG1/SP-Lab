package models;

public class DocumentManager {

	private static DocumentManager instance;
	private Book book;

	private DocumentManager() {}

	public static DocumentManager getInstance() {
		
		if(instance == null) {
			
			instance = new DocumentManager();
		}
		
		return instance;

	}

	public Book getBook() {
		return this.book;
	}
	
	public void setBook(Book book) {
		
		this.book= book;
		
	}

}
