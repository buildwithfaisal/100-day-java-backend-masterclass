package three.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 100);
//        car1.speed = 100;
//        car1.brand = "Toyota";
//        car1.color = "Red";
        car1.drive();

        Car car2 = new Car("Kia", "White", -120);
//        car2.speed = 120;
//        car2.brand = "Kia";
//        car2.color = "White";
        car2.drive();


//        Car car3 = new Car("Honda");
//        car3.drive();

        System.out.println(car2.getSpeed());
        car2.setSpeed(500);
        System.out.println(car2.getSpeed());
//        System.out.println(car2.speed);
    }
}
