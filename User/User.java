package User;

import java.util.ArrayList;
import java.util.List;

import Book.Book;

public class User {
    private String name;
    private String ID;
    private List<Book> listOfBorrowedBooks = new ArrayList<>();

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

    public List<Book> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }
    
    // Setters
    public void setname(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }
    
    public void setID(String ID) {
        if (ID == null || ID.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty.");
        }
        this.ID = ID;
    }
    
    public void setListOfBorrowedBooks(ArrayList<Book> listOfBorrowedBooks) {
        if (listOfBorrowedBooks == null || listOfBorrowedBooks.trim().isEmpty()) {
            throw new IllegalArgumentException("listOfBorrowedBooks cannot be null or empty.");
        }
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    // Method to add a book to the list of borrowed books
    public void addBorrowedBook(Book book) {
        if (listOfBorrowedBooks.size() >= 3) {
            throw new IllegalStateException("User cannot borrow more than 3 books.");
        }
        this.listOfBorrowedBooks.add(book);
    }
    
    // Method to remove a book from the list of borrowed books
    public boolean removeBorrowedBook(Book book) {
        return this.listOfBorrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder borrowedBooks = new StringBuilder();
        for (Book book : listOfBorrowedBooks) {
            borrowedBooks.append(book.getTitle()).append(", ");
        }
        return "User [Name=" + name + ", ID=" + ID + ", Borrowed Books=" 
            + (borrowedBooks.length() > 0 ? borrowedBooks.toString() : "None") + "]";
    }
}
