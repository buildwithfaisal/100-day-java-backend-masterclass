package six.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    /*
    From Collections: e.g., collection.stream().
    From Arrays: e.g., Arrays.stream(array).
    From Specific Values: e.g., Stream.of("a", "b", "c").
    From Functions: e.g., Stream.iterate(0, n -> n + 2).
    From Files: e.g., Files.lines(path).
    Empty Stream: e.g., Stream.empty().
     */
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

        int[] numberArray = {1,2,3,4,5};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("a", "b", "c");
        Stream<Integer> integerStream1 = Stream.iterate(0, n -> n + 2);
        integerStream1.forEach(System.out::println);

        try {
            Stream<String> fileStream = Files.lines(Path.of("PATH"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stream<String> emptyStream = Stream.empty();
    }
}
