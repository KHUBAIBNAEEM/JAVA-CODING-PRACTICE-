class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class DowncastingClassHierarchy {
    public static void main(String[] args) {
        Shape shape = new Circle(); 

        if (shape instanceof Circle) { 
            Circle circle = (Circle) shape; 
            circle.draw(); // Now you can access Circle-specific methods
        }
    }
}