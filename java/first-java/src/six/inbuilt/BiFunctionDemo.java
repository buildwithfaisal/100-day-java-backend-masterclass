package six.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static BiFunction<Integer, Integer, Integer> addFunction
            = Integer::sum;

    public static BiFunction<Integer, Integer, Integer> subtract
            = (a, b) -> a - b;

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10,20));
        System.out.println(subtract.apply(10,20));

        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        BiFunction<Integer, Integer, Integer> combinedFunction =
                addFunction.andThen(multiplyBy2);

        System.out.println(combinedFunction.apply(2,5));
    }
}
