package UI;

import java.util.Scanner;
import Library.Library;
import Book.Book;
import User.User;

public class Menu {

    private Library library;
    private Scanner scanner;

    public Menu(Library library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("""
                1. Add book to library.
                2. Register user.
                3. Lend book.
                4. Retunr book.
                5. Show available books.
                6. Show borrowed books.
                7. Exit.
                """);
    }

    public void handleOption() {
        int option = 0;
        do {
            showMenu();
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: // Add book to library.
                    addBook();
                    break;
                case 2: // Register user.
                    registerUser();
                    break;
                case 3: // Lend book
                    lendBook();
                    break;
                case 4: // Retunr book
                    returnBook();
                    break;
                case 5: // Show available books
                    library.listAvailableBooks();
                    break;
                case 6: // Show borrowed books
                    library.listBorrowedBooks();
                    break;
            }

        } while (option != 7);

        // Closed the scanner
        scanner.close();
    }

    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, isbn, true);
        library.addBook(book);
        System.out.println("Book added successfully");
    }

    private void registerUser() {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = new User(name, userId);
        library.registerUser(user);
        System.out.println("User added successfully");
    }

    private void lendBook() {
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        library.lendBook(isbn, userId);
    }

    private void returnBook() {
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        library.returnBook(isbn, userId);
    }
} // End Menu
