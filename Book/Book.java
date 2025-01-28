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

    // Constructor with isAvailabel = tru by default
    public Book(String title, String author, String isbn) {
        this(title, author, isbn, true); // By default is available
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
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
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Override toString()
    @Override 
    public String toString() { 
        return "\nBook Details:\n"
        + "- Title: " + title + "\n"
        + "- Author: " + author + "\n"
        + "- ISBN: " + isbn + "\n"
        + "- Available: " + (isAvailable ? "Yes" : "No");
     }

    // End of class Book
}
