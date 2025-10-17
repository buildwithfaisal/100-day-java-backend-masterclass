package two;

public class Operators {
    public static void main(String[] args) {
//        System.out.println(10 + (20 * 2));

        arithmeticDemo();
        unaryDemo();
        assignmentDemo();
        comparisonDemo();
        logicalDemo();

    }

    private static void arithmeticDemo() {
        System.out.println("\n--- Arithmetic Operators ---");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1
    }

    private static void unaryDemo() {
        System.out.println("\n--- Unary Operators ---");
        int x = 5;
//        int a = x++;
        System.out.println("++x = " + (++x)); // 6
        System.out.println("x++ = " + (x++)); // 6, then becomes 7
        System.out.println("x after post-increment = " + x); // 7
        System.out.println("-x = " + (-x));   // -7
//        x = -x;
        System.out.println("x = " + (x));   // 7
        System.out.println("(x > 0) = " + (x > 0)); // true
    }

    // 3. Assignment Operators
    private static void assignmentDemo() {
        System.out.println("\n--- Assignment Operators ---");
        int y = 10;
        y += 5; // y = y + 5;
        y *= 2; // y = y * 2;
        System.out.println("y after += and *= : " + y);
    }

    private static void comparisonDemo() {
        System.out.println("\n--- Comparison Operators ---");
        int age = 18;
        System.out.println("age >= 18: " + (age >= 18));
        System.out.println("age != 21: " + (age != 21));
    }


    private static void logicalDemo() {
        System.out.println("\n--- Logical Operators ---");
        boolean isAdult = true;
        boolean hasTicket = false;
        if (isAdult || hasTicket) {
            System.out.println("Welcome");
        } else {
            System.out.println("Bye");
        }

         if ((4 > 10) || (5 < 10)) {
             System.out.println("Hello");
         }

         // Ternary => (condition) : (TRUE) ? (FALSE)
        System.out.println((isAdult && hasTicket) ? "Welcome" : "Bye");
    }



}
