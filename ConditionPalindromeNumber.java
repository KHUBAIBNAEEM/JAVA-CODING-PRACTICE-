import java.util.Scanner;

public class ConditionPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num, reverse = 0;
        
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        
        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        scanner.close();
}
}
