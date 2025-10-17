package six.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 55);

        // reduce()
        Stream<Integer> integerStream = numbers.stream();
//        int sum = integerStream.reduce(0,(acc, num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("SUM: " + sum);

        int total = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("TOTAL: " + total);

        // collect()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("EVEN NUMBERS: " + evenNumbers);

        Set<Integer> evenNumbersSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("EVEN NUMBERS: " + evenNumbersSet);


        // find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has40 = numbers.stream()
                .anyMatch(n -> n == 40);
        System.out.println(has40);

        // iteration
        numbers.stream()
                .forEach(System.out::println);

    }
}
