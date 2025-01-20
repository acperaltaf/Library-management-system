package Library;

import java.util.ArrayList;
import Book.Book;
// import User.User;

public class Library {
    private ArrayList<Book> listOfBooks;
    // ArrayList<User> listOfUsers = new ArrayList<>();

    public Library() {
        this.listOfBooks = new ArrayList<>();
    }

    // Getters
    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    // Setters
    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        this.listOfBooks.add(book);
    }
    
}
