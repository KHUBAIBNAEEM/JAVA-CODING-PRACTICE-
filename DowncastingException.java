// Implement a program to perform downcasting and handle `ClassCastException` 
class Animal{
    public void sound(){
        System.out.println("The animal sounds....");
    }
}
class Goat extends Animal{
    public void sound (){
        System.out.println("The Goat says meh meh...");
    }
}
public class DowncastingException {
    public static void main(String[] args) {
        Animal properties = new Animal();
        try {
            Goat d = (Goat) properties; // downcasting
            d.sound();
        } catch (ClassCastException e) {
            System.out.println("It cannot downcast...");
        }
    }
    
}
