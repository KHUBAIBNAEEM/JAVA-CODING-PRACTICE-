public class CastingIntChar {
    public static void main(String[] args) {
        int intValue = 11111; 
        char charValue = (char) intValue;

        System.out.println("Int value: " + intValue);
        System.out.println("Char value: " + charValue); // Output: Char value: A
    }
}

