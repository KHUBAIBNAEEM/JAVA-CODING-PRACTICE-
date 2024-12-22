// Implement a program where upcasting helps simplify method overriding.

class Parent{
    public void Display(){
        System.out.println("In a parent class....");
    }
}
class Child extends Parent{
    public void Display(){
        System.out.println("In a child class.....");
    }
}

public class UpcastingOverriding {
    public static void main(String[] args) {
        try {
            Parent p = new Child();
            p.Display();
        } catch (Exception e) {
            System.out.println("Error in a code");
        }
    }
    
}
