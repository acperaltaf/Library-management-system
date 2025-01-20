package Main;

import Book.Book;
import UI.Menu;
import Library.Library;

public class Main {
    public static void main(String[] args) {
        // Menu.showMenu();
        Book book1 = new Book("Cien años de soledad", "Gabriel García Marquez", "123456-09", true);
        Book book2 = new Book("Juego de tronos", "George R. R. Martin", "654321-90", true);
        Library library = new Library();
        
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("-- -- List of books -- --");
        for (Book book : library.getListOfBooks()) {
            System.out.println(book);
        }

    }
    
}