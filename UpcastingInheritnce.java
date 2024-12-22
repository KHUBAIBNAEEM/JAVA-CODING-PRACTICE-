// Write a program to demonstrate upcasting with class inheritance 
// https://www.scaler.com/topics/upcasting-and-downcasting-in-java/ 

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class UpcastingInheritnce {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting dog is calling animal child is calling parent subclass is calling super
        a.sound(); // Calls Dog's sound method due to polymorphism
    }
}