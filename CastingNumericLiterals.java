public class CastingNumericLiterals {
    public static void main(String[] args) {
        byte b = (byte) 127; // Casting int literal to byte
        short s = (short) 32767; // Casting int literal to short
        int i = (int) 3.14; // Casting double literal to int 
        long l = (long) 1000000000; // Casting int literal to long

        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
    }
}