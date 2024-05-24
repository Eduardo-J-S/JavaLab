package map.Ordenacao;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        OnlineBookstore bookstore = new OnlineBookstore();

        // Adding books
        bookstore.addBook("https://amazon.com/book1", "Book 1", "Author 1", 49.99);
        bookstore.addBook("https://amazon.com/book2", "Book 2", "Author 2", 29.99);
        bookstore.addBook("https://amazon.com/book3", "Book 3", "Author 1", 39.99);
        bookstore.addBook("https://amazon.com/book4", "Book 4", "Author 4", 27.59);

        // Displaying books sorted by price
        System.out.println("Books sorted by price:");
        System.out.println(bookstore.displayBooksSortedByPrice());

        // Searching books by author
        System.out.println("\nBooks by Author 1:");
        Map<String, Book> booksByAuthor1 = bookstore.searchBooksByAuthor("Author 1");
        booksByAuthor1.forEach((link, book) -> System.out.println(link + ": " + book)); // return Map

        // Getting the most expensive book
        System.out.println("\nMost expensive book:");
        System.out.println(bookstore.getMostExpensiveBook());

        // Getting the cheapest book
        System.out.println("\nCheapest book:");
        System.out.println(bookstore.getCheapestBook());

        // Removing a book
        bookstore.removeBook("Book 2");

        // Displaying books sorted by price after removal
        System.out.println("\nBooks sorted by price after removal:");
        System.out.println(bookstore.displayBooksSortedByPrice());
    }
}