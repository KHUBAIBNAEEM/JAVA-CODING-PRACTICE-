// Program to toggle the case of a character using bitwise XOR:
import java.util.Scanner;

public class ToggleCaseXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Toggle case using XOR with 32
        char toggled = (char)(ch ^ 32);
        System.out.println("Original character: " + ch);
        System.out.println("Toggled character: " + toggled);
    }
}
 
