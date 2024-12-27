import java.util.Scanner;

public class ScannerTwoNumberAddition {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int n2 = sc.nextInt();
    System.out.println("The sum is: " + (n1 + n2));
    sc.close();
}
}
