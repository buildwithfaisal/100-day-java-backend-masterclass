package seven;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> nullOptional = Optional.ofNullable(null);

        // ifPresent()
        nullOptional.ifPresent(value -> {
            System.out.println(value);
            System.out.println("Hey");
        });

        // map()
        Optional<String> upperCase = nullOptional.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));

        // filter()
//        Optional<String> temp = name.filter(n -> n.startsWith("J"));
//        temp.ifPresent(System.out::println);

        name.filter(n -> n.startsWith("J"))
                .ifPresent(System.out::println);

        // Combined Operation
        name.filter(n -> n.startsWith("F"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
