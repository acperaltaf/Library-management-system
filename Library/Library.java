package Library;

import java.util.ArrayList;
import java.util.List;
import Book.Book;
import User.User;

public class Library {
    private List<Book> listOfBooks;
    private List<User> listOfUsers;

    public Library() {
        this.listOfBooks = new ArrayList<>();
        this.listOfUsers= new ArrayList<>();
    }

    // Getters
    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public List<User> getListOfUsers() {
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
  
    // Method to find book by ISBN
    private Book findBookByIsbn(String isbn) {
        for (Book book : listOfBooks) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Method to find user by user ID
    private User findUserById(String userId) {
        for (User user : listOfUsers) {
            if (user.getID().equals(userId)) {
                return user;
            }
        }
        return null;
    }
    
    // Method to lend books
    public void lendBook(String isbn, String userId) {
        Book book = findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }
        if (!book.getIsAvailable()) {
            System.out.println("Book not available");
            return;
        }
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        if (user.getListOfBorrowedBooks().size() >= 3) {
            System.out.println("User has reached the maximum number of borrowed books");
            return;
        }
        book.setIsAvailable(false);
        user.addBorrowedBook(book);
        System.out.println("Book borrowed to " + user.getName());
    }


    // Method for returning a book to the library
    public void returnBook(String isbn, String userId) {
        Book book = findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }
        // if (!book.getIsAvailable()) {
        //     System.out.println("Book not available");
        //     return;
        // }
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        // if (user.getListOfBorrowedBooks().size() >= 3) {
        //     System.out.println("User has reached the maximum number of borrowed books");
        //     return;
        // }
        book.setIsAvailable(true);
        user.removeBorrowedBook(book);
        System.out.println("Book returned by " + user.getName());
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
