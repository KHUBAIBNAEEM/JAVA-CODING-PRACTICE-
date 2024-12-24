import java.util.ArrayList;
import java.util.List;

class Vehicle {
    void start() {
        System.out.println("Starting the vehicle.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Starting the car engine.");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Starting the motorcycle engine.");
    }
}

public class UpcastingArrayList {
    public static void main(String[] args) {
        try {
            List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());

        // Now, you can call start() without casting:
        for (Vehicle vehicle : vehicles) {
        vehicle.start();
}
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error.............");
        }
        
    }
}
