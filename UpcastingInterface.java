//  Create an example where upcasting is applied to an interface.
interface AnimalInterface {
    void sound();
}

class Cat implements AnimalInterface {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class UpcastingInterface {
    public static void main(String[] args) {
        try {
            AnimalInterface Ai = new Cat();
            Ai.sound();
        } catch (Exception e) {
            System.out.println("Error .......");
        }
    }
}
