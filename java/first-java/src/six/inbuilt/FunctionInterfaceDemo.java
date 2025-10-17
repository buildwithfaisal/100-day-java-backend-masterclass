package six.inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static Function<Integer, Integer> addFunction = (a) -> a + 3;
    public static Function<Integer, Integer> substractFunction = (a) -> a - 7;

    public static Function<Integer, Integer> combinedFunction =
            addFunction.andThen(substractFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(substractFunction.apply(10));

        System.out.println(combinedFunction.apply(10));
    }
}
