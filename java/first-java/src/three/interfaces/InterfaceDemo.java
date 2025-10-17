package three.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
//        ElectricCar e1 = new ElectricCar();
//        e1.applyBrakes();
//        e1.turnLeft();

        CarControls myCar1 = new ElectricCar();
        myCar1.turnLeft();

        CarControls myCar2 = new SportsCar();
        myCar2.turnLeft();
    }
}
