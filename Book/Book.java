package Book;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Override toString()
    @Override 
    public String toString() { 
        return "Book\n[Title = " + title + ", \nAuthor = " + author + ", \nISBN = " + isbn + ", \nAvailable = " + isAvailable + "]\n";
    }

    // End of class Book
}
