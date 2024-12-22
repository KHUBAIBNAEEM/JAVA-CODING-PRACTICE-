interface Animal2 {
    void sound();
}

class Cow implements Animal2 {
    public void sound() {
        System.out.println("Bark Bark.......");
    }
}

class DowncastingInstanceOf {
    public static void main(String[] args) {
        Animal2 obj = new Cow(); // Upcasting
        try {
        if (obj instanceof Cow) {
            Cow obj1 = (Cow) obj; // Safe Downcasting
            obj1.sound();
        } else {
            System.out.println("The object is not an instance of Cow");
        }
    }
    catch (Exception e) {
        // TODO: handle exception
        System.out.println("ERRORRRRR...");
    }
}
}