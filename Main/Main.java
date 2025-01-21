package Main;

import Book.Book;
import UI.Menu;
import Library.Library;
import User.User;

public class Main {
    public static void main(String[] args) {
        // Menu.showMenu();
        Book book1 = new Book("Cien años de soledad", "Gabriel García Marquez", "123456-09", true);
        Book book2 = new Book("Juego de tronos", "George R. R. Martin", "654321-90", true);
        Library library = new Library();
        
        library.addBook(book1);
        library.addBook(book2);

        /* 
        System.out.println("-- -- List of books -- --");
        for (Book book : library.getListOfBooks()) {
            System.out.println(book);
        }
        */

        // ----------------------------

        User user = new User("Andres", "a01");
        library.registerUser(user);

        Book book3 = new Book("El señor de los anillos","J. R. R.Tolkien", "2468-70", true);
        
        user.addBorrowedBook(book2);
        user.addBorrowedBook(book3);
        user.removeBorrowedBook(book2);
        
        /* Comment */
        // System.out.println(user.getListOfBorrowedBooks());
        for (Book book : user.getListOfBorrowedBooks()) {
            System.out.println(book);
        }
        
        Book book4 = new Book("Don Quijote De La Mancha","Miguel de Cervantes Saavedra", "13579-71", true);
        library.addBook(book4);
        Book book5 = new Book("Cronicas de una muerte anuncida","Gabriel García Márquez", "99123-34", true);
        library.addBook(book5);
        library.lendBook(book5.getIsbn(), user.getID());

        library.lendBook(book4.getIsbn(), user.getID());
        System.out.println("Book 4 availability -> " + book4.getIsAvailable());
        
        library.returnBook(book4.getIsbn(),user.getID());
        System.out.println("Book 4 availability -> " + book4.getIsAvailable());

        System.out.println("-0-0-0-0-0-0-0-0-0-0-00-0-0-");
        library.listAvailableBooks();
        
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        library.listBorrowedBooks();
    } // End main
} // End Main