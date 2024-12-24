abstract class shape{
    abstract void draw(); // abstract method donot specifies a body
}
class circle extends shape{
    void draw(){
        System.out.println("Cirlce is drwaing in child shape");
    } 

public class UpcastingAbstract {
public static void main(String[] args) {
    try {
        shape obj = new circle();
        obj.draw();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Error.......");
    }
    
}
    
}
}
