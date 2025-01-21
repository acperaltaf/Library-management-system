package User;

import java.util.ArrayList;
import Book.Book;

public class User {
    String name;
    String ID;
    ArrayList<Book> listOfBorrowedBooks = new ArrayList<>();

    // Contructor whit list of borrowed books
    public User(String name, String ID, ArrayList<Book> listOfBorrowedBooks) {
        this.name = name;
        this.ID = ID;
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    // Contructor whitout the list of borrowed books
    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.listOfBorrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Book> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }
    
    // Setters
    public void setname(String name) {
        this.name = name;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setListOfBorrowedBooks(ArrayList<Book> listOfBorrowedBooks) {
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    // Method to add a book to the list of borrowed books
    public void addBorrowedBook(Book book) {
        this.listOfBorrowedBooks.add(book);
    }

    // Method to remove a book from the list of borrowed books
    public void removeBorrowedBook(Book book) {
        this.listOfBorrowedBooks.remove(book);
    }
}
