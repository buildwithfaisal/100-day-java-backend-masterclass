package three.polymorphism;

public class Car extends Vehicle {
    private int doors;


    public Car(String brand, int speed, int doors) {
        super(brand, speed);
//        this.brand = brand;
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Starting Car...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + doors + " doors");
    }
}
