package three.polymorphism;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Starting Bike...");
    }

    public void start(String greet) {
        System.out.println("Starting Bike..." + greet);
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + hasCarrier);
    }
}
