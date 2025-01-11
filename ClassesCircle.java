class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class ClassesCircle {
    public static void main(String[] args) {
        Circle obj5 = new Circle(4.4);
        System.out.println(obj5.calculateArea());
        System.out.println(obj5.calculateCircumference());   
    }
}
