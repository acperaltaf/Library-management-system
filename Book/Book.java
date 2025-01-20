package Book;

public class Book {
    private String title;
    private String autor;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String autor, String isbn, boolean isAvailable) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
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

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }    

    
// End of class Book
}
