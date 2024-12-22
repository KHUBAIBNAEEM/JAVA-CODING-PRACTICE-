//Write a program to convert a `long` to `short` using casting.

public class CastingLongShort {
    public static void main(String[] args) {
        long l = 123456;
        short s = (short) l; // Explicit casting
        try {
            System.out.println("Original long: " + l);
        System.out.println("After casting to short: " + s);
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in the code");
        }
    }
}
