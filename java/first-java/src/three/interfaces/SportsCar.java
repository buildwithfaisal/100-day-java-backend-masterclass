package three.interfaces;

public class SportsCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("SPORTS RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("SPORTS LEFT");
    }

    @Override
    public void applyBrakes() {
        System.out.println("SPORTS BRAKES");
    }
}
