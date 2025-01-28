package Main;

import Library.Library;
import UI.Menu;
import Book.Book;
import User.User;

public class Main {
    public static void main(String[] args) {
        
        // Instace the Library
         Library library = new Library();

        // Load test data
        loadTestData(library);

        //  Instatiate and start the menu
        System.out.println("Welcome to the Library Management System!");
         Menu menu = new Menu(library);
         menu.handleOption();
         System.out.println();
         System.out.println("Exiting the system. Have a great day!");
        
        } // End main

    // Method to load test data
    private static void loadTestData(Library library) {
        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez", "123456-09", true));
        library.addBook(new Book("El señor de los anillos", "J. R. R. Tolkien", "2468-70", true));
        library.addBook(new Book("Juego de tronos", "George R. R. Martin", "654321-90", true));
        library.addBook(new Book("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", "13579-71", true));
        library.addBook(new Book("Crónicas de una muerte anunciada", "Gabriel García Márquez", "99123-34", true));

        library.registerUser(new User("Andrés", "a01"));
    }
} // End Main