class Vehicle {
    double fuelConsumed; // in liters
    double distanceTraveled; // in kilometers

    // Constructor
    public Vehicle(double fuelConsumed, double distanceTraveled) {
        this.fuelConsumed = fuelConsumed;
        this.distanceTraveled = distanceTraveled;
    }

    // Method to calculate fuel efficiency (km per liter)
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelConsumed;
    }

    // Method to estimate maintenance cost
    public double calculateMaintenanceCost() {
        return distanceTraveled * 0.05; // Example: $0.05 per km
    }
}

    public class ClassesVehicle{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(50, 600);
        System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency() + " km/l");
        System.out.println("Maintenance Cost: $" + vehicle.calculateMaintenanceCost());
    }
}
