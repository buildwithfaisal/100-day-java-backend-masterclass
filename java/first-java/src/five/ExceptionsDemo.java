package five;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void main(String[] args) {
//        int a = 10;
//        int result = 10 / 0;
//        System.out.println("Done");

        try {
            // EXCEPTION GENERATING STATEMENTS
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // EXCEPTION HANDLING STATEMENTS
            System.out.println("In Catch Block");
        }
        System.out.println("DONE");

        int[] a = {1, 2, 3};
        try {
            System.out.println(a[2]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION");
        } catch (ArithmeticException e) {

        } finally {
            // ALWAYS EXECUTES
            System.out.println("FINALLY");
        }
        System.out.println("OUTSIDE TRY CATCH");

//        System.out.println(a[6]);

        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        }
    }
}





