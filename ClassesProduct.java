class Product {
    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount
    public void applyDiscount(double discountPercentage) {
        price -= price * discountPercentage / 100;
    }

    // Method to display final price
    public void displayPrice() {
        System.out.println("Final Price: " + price);
    }
}

    public class ClassesProduct {

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(10);
        product.displayPrice();
    }
}

