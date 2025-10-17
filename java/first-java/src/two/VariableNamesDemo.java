package two;

public class VariableNamesDemo {
    /*
=================================================
   VARIABLE NAMING RULES IN JAVA
=================================================
✅ Rules:
• Case-sensitive (age ≠ Age)
• Must begin with a letter, '_' or '$' (but prefer letters)
• Cannot start with a digit
• No spaces or special symbols (%, #, @, etc.)
• Cannot be a Java keyword (e.g., int, class, for)
• Can contain letters, digits, '_' or '$' after the first character
• Use meaningful names (avoid x1, a2)
• Use lowerCamelCase for normal variables (totalMarks)
• Use UPPER_CASE_WITH_UNDERSCORES for constants (MAX_SPEED)

-------------------------------------------------
*/

    public static void main(String[] args) {
        // ✅ VALID variable names
        int age = 25;
        int studentCount = 100;
        int _score = 95;          // legal but not recommended
        int $total = 500;         // legal but not recommended
        int gearRatio = 6;
        final int MAX_SPEED = 120; // constant naming convention

        // Printing valid variables
        System.out.println("Age: " + age);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Gear Ratio: " + gearRatio);
        System.out.println("Max Speed: " + MAX_SPEED);

        // ❌ INVALID variable names (uncomment to see compiler errors)
        /*
        int 2fast = 50;          // ❌ cannot start with a digit
        int student-count = 40;  // ❌ hyphens not allowed
        int total marks = 100;   // ❌ spaces not allowed
        int for = 5;             // ❌ 'for' is a keyword
        int @rate = 10;          // ❌ '@' not allowed
        int class = 1;           // ❌ reserved keyword
        */

        // ✅ Example showing case-sensitivity
        int number = 10;
        int Number = 20;  // different variable (case-sensitive)
        System.out.println("number = " + number);
        System.out.println("Number = " + Number);
    }
}
