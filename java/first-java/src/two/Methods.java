package two;

public class Methods {
    public static void main(String[] args) {
        sayHello("John");

        sayHello("Michael");

        // 10 lines
        sayHello("Mohan");
        sayHello("Sunil");
        System.out.println("Add: " + add(10,20));
    }

    private static void sayHello(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Welcome to Skywards");
    }

    private static int add (int a, int b) {
        return a + b;
    }
}
