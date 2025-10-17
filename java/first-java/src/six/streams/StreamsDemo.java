package six.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // Streams --> Assembly line / pipeline
        List<String> items = Arrays.asList("Apple","Banana","Cherry");
        for (String fruit : items)
            System.out.println(fruit);

        // Using Streams
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        System.out.println("== Filtered Fruits ==");
        /*Stream<String> streamNew = items.stream();
        Stream<String> filteredStream
                = streamNew.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::println);*/

        items.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);

        /*
        * USE CASES:
        * 1. Filtering
        * 2. Mapping
        * 3. Aggregation
        * 4. Searching
        * 5. Iteration
        *
        *
        * */
    }
}
