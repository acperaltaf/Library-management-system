package Main;

import Library.Library;
import UI.Menu;
// import Book.Book;
// import User.User;

public class Main {
    public static void main(String[] args) {
        /*
        Book book1 = new Book("Cien años de soledad", "Gabriel García Marquez", "123456-09", true);
        Book book3 = new Book("El señor de los anillos","J. R. R.Tolkien", "2468-70", true);
        Book book2 = new Book("Juego de tronos", "George R. R. Martin", "654321-90", true);
        Book book4 = new Book("Don Quijote De La Mancha","Miguel de Cervantes Saavedra", "13579-71", true);
        Book book5 = new Book("Cronicas de una muerte anuncida","Gabriel García Márquez", "99123-34", true);
        
        // Instantiate the Library
        Library library = new Library();
        
        // Instatiante the User
        User user = new User("Andres", "a01");

        // Add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        
        // Register user in the library
        library.registerUser(user); 
         */
        
         Library library = new Library();
         Menu menu = new Menu(library);

        //  menu.showMenu();
         menu.handleOption();
        
    } // End main
} // End Main