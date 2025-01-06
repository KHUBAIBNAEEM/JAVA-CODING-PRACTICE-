class Car { // Clss - Noun
    String model;
    String brand;
    double price;

    Car(String model, String brand, double price) { // Constructor
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    void displayDetails() { //Method - Verb
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}


public class ClassesCarDetails {
    public static void main(String[] args) {
        Car obj3 = new Car("Benz", "Mercedes", 370000.0);
        obj3.displayDetails();


    }
}
