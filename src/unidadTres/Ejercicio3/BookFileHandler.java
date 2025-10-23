package unidadTres.Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BookFileHandler {

    private static final String FILENAME = "books.txt";

    public void saveBooks(List<Book> books) {
        // Using try-with-resources to ensure the writer is closed automatically.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Book book : books) {
                // We can use the toString() representation or a custom format.
                // Here, we'll use a simple comma-separated format for clarity.
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getPrice());
                writer.newLine(); // Adds a new line for the next book.
            }
            System.out.println("✅ Books successfully saved to " + FILENAME);
        } catch (IOException e) {
            System.err.println("❌ Error saving books to file: " + e.getMessage());
        } finally {
            System.out.println("Operation finished."); // Bonus: This runs after the try or catch block.
        }
    }

    /**
     * Reads books from a file and prints them to the console.
     */
    public void readBooks() {
        System.out.println("\n--- Reading Books from " + FILENAME + " ---");
        // Using try-with-resources to ensure the reader is closed automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.err.println("❌ Error reading books from file: " + e.getMessage());
        } finally {
            System.out.println("Operation finished."); // Bonus: This runs after the try or catch block.
        }
    }
}