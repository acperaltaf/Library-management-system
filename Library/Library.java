package Library;

import java.util.ArrayList;
import Book.Book;
import User.User;

public class Library {
    private ArrayList<Book> listOfBooks;
    private ArrayList<User> listOfUsers = new ArrayList<>();

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
            if (book.getIsbn().equals(isbn) && book.getIsAvailable()) {
                for ( User user : listOfUsers) {
                    if (user.getID().equals(userId)) {
                        // Lend the book and mark it as unavailable
                        book.setIsAvailable(false);
                        user.addBorrowedBook(book);
                        System.out.println("Book borrowed to " + user.getNombre());
                        return;
                    }
                } 
                System.out.println("User not found");
                return;
            } else {
                System.out.println("Book not found or not available");
                return;
            }
        }
        System.out.println("Book not found");
    }
}
