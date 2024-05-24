package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OnlineBookstore {

    Map<String, Book> bookstoreMap;

    public OnlineBookstore() {
        this.bookstoreMap = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price) {
        this.bookstoreMap.put(link, new Book(title, author, price));
    }

    public void removeBook(String title) {
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Book> entry : bookstoreMap.entrySet()) {
            if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key : keysToRemove) {
            bookstoreMap.remove(key);
        }
    }

    public Map<String, Book> displayBooksSortedByPrice() {
        List<Map.Entry<String, Book>> booksToSortByPrice = new ArrayList<>(bookstoreMap.entrySet());

        Collections.sort(booksToSortByPrice, new PriceComparator());

        Map<String, Book> booksSortedByPrice = new LinkedHashMap<>();

        for (Map.Entry<String, Book> entry : booksToSortByPrice) {
            booksSortedByPrice.put(entry.getKey(), entry.getValue());
        }

        return booksSortedByPrice;
    }

    public Map<String, Book> searchBooksByAuthor(String author) {
        return bookstoreMap.entrySet().stream()
                .filter(entry -> entry.getValue().getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
    }

    public List<Book> getMostExpensiveBook() {
        double mostExpensivePrice = Double.MIN_VALUE;
        List<Book> mostExpensive = new ArrayList<>();

        for (Book entry : bookstoreMap.values()) {
            if (entry.getPrice() > mostExpensivePrice) {
                mostExpensivePrice = entry.getPrice();
            }
        }

        for (Map.Entry<String, Book> entry : bookstoreMap.entrySet()) {
            if (entry.getValue().getPrice() == mostExpensivePrice) {
                Book bookWithHighestPrice = bookstoreMap.get(entry.getKey());
                mostExpensive.add(bookWithHighestPrice);
            }
        }
        return mostExpensive;
    }

    public Book getCheapestBook() {
        return bookstoreMap.values().stream().min(Comparator.comparingDouble(book -> book.getPrice()))
                .orElse(null);
    }
}
