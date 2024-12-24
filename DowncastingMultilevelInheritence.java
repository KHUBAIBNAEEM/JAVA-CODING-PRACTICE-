class Grandparent {
}

class Parent extends Grandparent {
}

class Child extends Parent {
}

public class DowncastingMultilevelInheritence {
    public static void main(String[] args) {
        Grandparent grandparent = new Child(); 
        if (grandparent instanceof Child) {
            Child child = (Child) grandparent; 
        }
    }
}