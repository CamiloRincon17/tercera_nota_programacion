package unidadTres.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Book File Handling Exercise ---");

        // 1. Create a list of 3 books.
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 25.99));
        bookList.add(new Book("1984", "George Orwell", 15.50));
        bookList.add(new Book("Dune", "Frank Herbert", 19.75));

        // Create an instance of the file handler.
        BookFileHandler fileHandler = new BookFileHandler();

        // 2. Save the books to a file.
        fileHandler.saveBooks(bookList);

        // 3. Read the books from the file and display them.
        fileHandler.readBooks();
    }
}
