class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class ClassesRectanglePerimeterCalc{
public static void main(String[] args) {
    Rectangle obj1 = new Rectangle(3.1,4.5 );
    System.out.println("Area: " + obj1.calculateArea());
    System.out.println("Perimeter: " + obj1.calculatePerimeter());


    
}
}