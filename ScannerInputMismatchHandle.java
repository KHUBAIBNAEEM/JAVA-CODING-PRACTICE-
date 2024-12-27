import java.util.Scanner;

public class ScannerInputMismatchHandle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your digit and check validity: ");
    try {
        int number = sc.nextInt();
        System.out.println("Your " + number + " is valid integer");
    } catch (Exception e) {
        System.out.println("Error... Please enter correct integer");
    }
    sc.close();
}    
}
