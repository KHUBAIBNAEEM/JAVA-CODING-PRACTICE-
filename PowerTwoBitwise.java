// Write a program to check if a number is a power of 2 using bitwise operators

public class PowerTwoBitwise {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(n + " is power of 2: " + ((n & (n - 1)) == 0));
    }
}
