package Library;

import java.util.ArrayList;
import Book.Book;
import User.User;

public class Library {
    private ArrayList<Book> listOfBooks;
    private ArrayList<User> listOfUsers;

    public Library() {
        this.listOfBooks = new ArrayList<>();
        this.listOfUsers= new ArrayList<>();
    }

    // Getters
    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    // Setters
    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void  setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        this.listOfBooks.add(book);
    }

    // Method to registering users
    public void registerUser(User user) {
        this.listOfUsers.add(user);
    }
    
    // Method to lend books
    public void lendBook(String isbn, String userId) {
        // Search for the book by its isbn
        for (Book book : listOfBooks) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getIsAvailable()) { // Check if the book is available
                    for ( User user : listOfUsers) {
                        if (user.getID().equals(userId)) {
                            // Lend the book and mark it as unavailable
                            book.setIsAvailable(false);
                            user.addBorrowedBook(book);
                            System.out.println("Book borrowed to " + user.getName());
                            return;
                        }
                    } 
                    System.out.println("User not found");
                    return;
                } else {
                    System.out.println("book not available");
                    return;
                }
            } 
        }
        System.out.println("Book not found");
    }

    // Method for returning a book to the library
    public void returnBook(String isbn, String userId) {
        for (Book book : listOfBooks) {
            if(book.getIsbn().equals(isbn)) {
                if (!book.getIsAvailable()) {
                    for (User user : listOfUsers) {
                        if (user.getID().equals(userId)) {
                            book.setIsAvailable(true);
                            user.removeBorrowedBook(book);
                            System.out.println("Book returned by " + user.getName());
                            return;
                        }
                    }
                    System.out.println("User not found");
                    return;
                }
                System.out.println("Book is already available");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Method to show available books
    public void listAvailableBooks() {
        System.out.println("\tAvailable books:");
        for (Book book : getListOfBooks()) {
            if (book.getIsAvailable()) {
                System.out.println(book);
            }
        }
    }

    // Method to show borrowed books
    public void listBorrowedBooks() {
        System.out.println("\tborrowed books:");
        for (Book book : getListOfBooks()) {
            if (!book.getIsAvailable()) {
                System.out.println(book);
            }
        }
    }
}
