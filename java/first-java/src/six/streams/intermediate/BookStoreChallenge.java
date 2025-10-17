package six.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */

        List<Book> books = Arrays.asList(
                new Book("Fiction", 15.99, 2018, "The Silent Garden"),
                new Book("Science", 22.50, 2020, "Cosmic Wonders"),
                new Book("Fiction", 12.75, 2005, "Echoes in the Rain"),
                new Book("Biography", 18.00, 2022, "A Life in Code"),
                new Book("Technology", 35.90, 2023, "Java Stream Mastery"),
                new Book("Fiction", 14.50, 2018, "The Midnight Library"),
                new Book("Science", 25.99, 2015, "Quantum Realm"),
                new Book("Technology", 40.00, 2023, "Advanced Spring Boot"),
                new Book("Biography", 16.99, 2019, "The Innovator's Journey"),
                new Book("Fiction", 9.99, 1998, "Old Man and the Sea")
        );

        // Identify all books that are priced over $20
        System.out.println("Identify all books that are priced over $20");
        books.stream()
                .filter(book -> book.price > 20)
                .forEach(System.out::println);

//        Identify and display books that were published before the year 2000.
        System.out.println("Identify and display books that were published before the year 2000.");
        books.stream()
                .filter(book -> book.publicationYear < 2000)
                .forEach(System.out::println);

        //Add suffix "(Coming Soon)" to all the current titles
        System.out.println("Add suffix \"(Coming Soon)\" to all the current titles");
        books.stream()
                .map(book -> book.title + " (Coming Soon)")
                .forEach(System.out::println);

//        Display the books sorted by their prices in ascending order.
        System.out.println("Display the books sorted by their prices in ascending order.");
        books.stream()
                .sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        // A rare book is one where the title has more than 20
        //            characters.
        System.out.println("A rare book is one where the title has more than 20\n" +
                "            characters.");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);

    }
}
