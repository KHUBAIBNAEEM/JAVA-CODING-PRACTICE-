// Write a program to demonstrate short-circuit logical operators.

public class ShortCircuit {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a > 10 && (a / 0 == 0)); // Short-circuit
    }
}