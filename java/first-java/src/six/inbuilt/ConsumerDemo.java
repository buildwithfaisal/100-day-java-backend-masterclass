package six.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer1 = (str) -> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;

        Consumer<String> consumer2 = str -> System.out.println("Length: " + str.length());

        consumer1.accept("Hello");
        consumer1.accept("Hi");

        consumer2.accept("Hello");
        consumer2.accept("Hi");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> multiplyByTwo = n -> System.out.println(n * 2);
        numbers.forEach(multiplyByTwo);
    }
}
