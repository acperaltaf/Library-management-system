package User;

import java.util.ArrayList;
import Book.Book;

public class User {
    String nombre;
    String ID;
    ArrayList<Book> listOfBorrowedBooks = new ArrayList<>();

    // Contructor whit list of borrowed books
    public User(String nombre, String ID, ArrayList<Book> listOfBorrowedBooks) {
        this.nombre = nombre;
        this.ID = ID;
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    // Contructor whitout the list of borrowed books
    public User(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
        this.listOfBorrowedBooks = new ArrayList<>()
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Book> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
