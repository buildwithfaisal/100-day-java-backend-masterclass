package seven;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String name = "Java";
        if (name != null)
            System.out.println(name.length());
        else
            System.out.println("No name value");

        // Creating Optional
        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        // Checking Values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        // get()
        System.out.println(optionalString.get());
//        System.out.println(mayBe.get());

        // orElse("default-value")
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("default"));
        System.out.println(mayBe.orElse(null));
        String temp = mayBe.orElse("default");

        // orElseGet(<supplier>)
        String result = optionalString.orElseGet(() -> {
            System.out.println("Generating Default Value");
            return "default";
        });
        System.out.println(result);

        // orElseThrow()
        String newResult = optionalString.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult);
    }
}
