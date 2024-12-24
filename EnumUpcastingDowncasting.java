enum Size {
    SMALL, MEDIUM, LARGE
}

class Box {
    Size size;

    Box(Size size) {
        this.size = size;
    }

    Size getSize() {
        return size;
    }
}

public class EnumUpcastingDowncasting {
    public static void main(String[] args) {
        Box box1 = new Box(Size.MEDIUM); 
        Size size = box1.getSize(); // Upcasting: Box.getSize() returns Size

        if (size == Size.LARGE) {
            Box largeBox = new Box(size); // Downcasting: Size to Box constructor
            System.out.println("Created a Large Box");
        } else {
            System.out.println("Not a Large Box.");
        }
    }
}