package two;

public class ControlFlow {
    /*
==========================================================
        CONTROL FLOW IN JAVA
==========================================================

🔹 What is Control Flow?
Control flow means how your program executes statements
based on conditions or loops. Instead of running code line
by line blindly, you can tell Java:

✅ “Do this if something is true.”
🔄 “Repeat this until a condition changes.”
🔀 “Choose one path from many.”

Java gives us three main types:
1. Decision-making → if, else if, else, switch
2. Loops (Iteration) → for, while, do-while, enhanced for-each
3. Jump statements → break, continue
*/

    public static void main(String[] args) {
        // if-else
        int age = 20;
        if (age > 18) {
            System.out.println("Welcome to our bank");
        } else {
            System.out.println("Try again when you turn 18");
        }

        // if-else ladder
        int marks = 40;
        if (marks > 90) {
            System.out.println("Grade A+");
        } else if (marks > 75) {
            System.out.println("Grade A");
        } else if (marks > 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade F");
        }

        // switch
        String day = "Saturday";
        switch (day) {
            case "Monday" -> System.out.println("Start of the week");
            case "Friday" -> System.out.println("Last day of the week");
            default -> System.out.println("Enjoy weekend");
        }


        // LOOPS

        // FOR
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Count: " + i);
//        }

        // While
        int num = 0;
        while (num > 0) {
            System.out.println("Num: " + num);
            num--;
        }

        // Do While
        int n = 0;
        do {
            System.out.println("n: " + n);
            n--;
        } while (n > 0);

        // Enhanced for each
        String[] fruits = {"Apples", "Banana"};
        for (String a : fruits) {
            System.out.println("Fruit: " + a);
        }

        // 5 -> 0-4
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }


        // JUMP STATEMENTS
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            if (i == 7) break;
            System.out.println("Count: " + i);
        }

    }
}
