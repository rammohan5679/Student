package files;

public class book {
	private String title;
    private String author;
    private String isbn;
    private double price;
    public book() {
    	
    }
    public book(String aTitle, String aAuthor,String anIsbn, double thePrice) {
    	title = aTitle;
    	author = aAuthor;
    	isbn = anIsbn;
    	price = thePrice;
    }
    public void PrintDetails() {
    	System.out.println("book name: "+ title);
    	System.out.println("Author: "+ author);
    	System.out.println("Isbn: "+ isbn);
    	System.out.println("Price: "+ price);
    }
 

    // Getter for isbn,title,author,price
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
    	return price;
    }

    // Setter for isbn,title,author,price
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    public String toString() {
    	return "Book[Title ="+title+",Author="+author+",Isbn="+isbn+",Price="+price+"]";
    }
}
