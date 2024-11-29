package files;

import java.util.ArrayList;

public class Library {
	private ArrayList<book>books;
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(book book) {
		books.add(book);
	}
	public void removeBook(String isbn) {
		books.removeIf(book -> book.getIsbn().equals(isbn));
	}
	public void PrintLibraryBooks() {
		for(int i=0;i<books.size();i++) {
			books.get(i).PrintDetails();;
		}
	}
	public book getBook(String isbn) {
		for (book book : books) {
        if (book.getIsbn().equals(isbn)) {
            return book;
        }
    }
    return null;
	
	}
}
