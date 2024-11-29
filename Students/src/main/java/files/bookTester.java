package files;

public class bookTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library library = new Library();
		book book = new book("Java Programming","John Doe","1234567890",299.0);
		book book1 = new book("Java ","vikas","0123456789",499.0);

       
        library.addBook(book);
        library.addBook(book1);
//		System.out.println(book);
//		System.out.println(book1);
		library.PrintLibraryBooks();
		library.removeBook("1234567890");
}
}
