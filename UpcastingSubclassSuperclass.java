// Store subclass objects in a superclass array
/* interface AnimalInterface {
    void sound();
}

class Cat implements AnimalInterface {
    public void sound() {
        System.out.println("Cat meows");
    }
} */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class UpcastingSubclassSuperclass {
    public static void main(String[] args) {
        /* try {
            Animal[] object = new Animal[2];
            object[0] = new Dog(); // Upcasting
            object[1] = new Cat(); // Upcasting
    
            for (Animal animal : object) {
                animal.sound(); // Polymorphism
            }
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error...");
        } */
        
            Animal[] animals = new Animal[2];
            animals[0] = new Dog(); // Upcasting
            animals[1] = new Cat(); // Upcasting
    
            for (Animal animal : animals) {
                animal.sound(); // Polymorphism
            }
        }
       
}

