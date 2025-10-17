package three.constructors;

public class Car {
    String brand;
    String color;
    int speed;

//    public Car(String brand) {
//        this.brand = brand;
//    }

//    public Car() {
//    }

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    //    public Car(String brand, String color, int speed) {
//        System.out.println("Constructor Called");
//        this.brand = brand;
//        this.color = color;
//        this.speed = speed;
//    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

//class abc {
//    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.speed = 100;
//        car1.brand = "Toyota";
//        car1.color = "Red";
//        car1.drive();
//
//        Car car2 = new Car();
//        car2.speed = 120;
//        car2.brand = "Kia";
//        car2.color = "White";
//        car2.drive();
//    }
//}
