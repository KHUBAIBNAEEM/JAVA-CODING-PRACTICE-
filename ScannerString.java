import java.util.Scanner;

public class ScannerString {
public static void main(String[] args) {
    System.out.print("Enter your first name: ");
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    System.out.print("Enter your last name: ");
    String s2 = sc.next();
    System.out.println("Full Name: " + s1 + " " + s2);
    sc.close();
}
}
