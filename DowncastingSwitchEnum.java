// Assuming Shape.java exists in the same directory

enum ShapeType {
    CIRCLE,
    SQUARE,
    RECTANGLE
}

class Shape {
    private ShapeType type;

    Shape(ShapeType type) {
        this.type = type;
    }

    void draw() {
        switch (type) {
            case CIRCLE:
                System.out.println("Drawing a Circle");
                break;
            case SQUARE:
                System.out.println("Drawing a Square");
                break;
            case RECTANGLE:
                System.out.println("Drawing a Rectangle");
                break;
            default:
                System.out.println("Unknown shape");
        }
    }
}

public class DowncastingSwitchEnum {
    public static void main(String[] args) {
        Shape shape = new Shape(ShapeType.CIRCLE);
        shape.draw(); // Output: Drawing a Circle
    }
}

// Try compiling from the terminal
/*An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces). */