class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
}

public class UpcastingSuperclassMethod {
    public static void main(String[] args) {
        Parent child = new Child(); // Upcasting
        child.parentMethod(); // Call the parent's method
    }
}