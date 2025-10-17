package four;

import java.util.ArrayList;
import java.util.List;

class CarNew {
    String brand;

    CarNew(String brand) {
        this.brand = brand;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
//        users.add(1);
        users.add("Alice");

        System.out.println("All Users");
        for (Object user : users) {
            System.out.println(user);
        }

        System.out.println("Element using index: " + users.get(3));

        // LIST OF OBJECTS
        CarNew car1 = new CarNew("Toyota");
        CarNew car2 = new CarNew("Ford");
        List<CarNew> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println(" == All Cars == ");
        for (CarNew car : carList) {
            System.out.println(car.brand);
        }
    }
}
