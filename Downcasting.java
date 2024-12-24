    class Parent {
        public void parentMethod() {
            System.out.println("Parent method");
        }
    }
    
    class Child extends Parent {
        public void childMethod() {
            System.out.println("Child method");
        }
    }
    
public class Downcasting {
public static void main(String[] args) {
            Parent pr = new Child(); // Upcasting
            if (pr instanceof Child) {
                Child ch = (Child) pr; 
                ch.childMethod(); // Access child-specific method
            }
        }
    }

