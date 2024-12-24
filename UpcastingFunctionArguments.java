class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class UpcastingFunctionArguments {
    public static void makeAnimalSound(Animal animal) { 
        animal.makeSound(); 
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        makeAnimalSound(dog); // Upcasting: Dog to Animal
        makeAnimalSound(cat); // Upcasting: Cat to Animal
    }
}