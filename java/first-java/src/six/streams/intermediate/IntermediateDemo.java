package six.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {
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

        // 1. Filtering: Books cheaper than $20
        Stream<Book> filteredBooks = books.stream()
                .filter(book -> book.price < 20);
        filteredBooks.forEach(System.out::println);

        // 2. Mapping: Convert book titles to uppercase
        Stream<String> upperCaseTitles = books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

        // 3. Sorting: Books by publication date
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);

        // 4. Distinct: Remove duplicate titles
        Stream<Book> uniqueBooks = books.stream().distinct();
        uniqueBooks.forEach(System.out::println);

        // 5. Limit: Display only the first 3 books
        System.out.println("DISPLAY FIRST 3 PUBLISHED BOOK BY PUBLICATION YEAR");
        Stream<Book> firstThreeBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear))
                .limit(3);
        firstThreeBooks.forEach(System.out::println);

        // 6. Skip: Skip the first 2 books
        System.out.println("DISPLAY AFTER SKIPPING TWO");
        Stream<Book> afterSkippingTwo = books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);


    }
}
