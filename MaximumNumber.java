//  Write a program to find the maximum of three numbers using conditional operators.

public class MaximumNumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;
        int max = a>b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum: " + max);
    }   
}