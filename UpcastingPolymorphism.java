// Demonstrate the use of upcasting in polymorphism

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle is drawing");
    }
}

public class UpcastingPolymorphism {
    public static void main(String[] args) {
    try{
    Shape object = new Circle();
    object.draw();
    }
    catch(ClassCastException e){
        System.out.println("Error in the code");
    }
    }
    
}
