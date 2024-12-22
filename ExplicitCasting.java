// Write a program to cast a `double` to `int` and observe the loss of precision.

public class ExplicitCasting {
    public static void main(String[] args) {
    double d = 3.124;
    int i = (int) d;
    // d = (int) i;
    System.out.println("After casting " + i);
    // System.out.println(d);
    }
}
