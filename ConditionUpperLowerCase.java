import java.util.Scanner;

public class ConditionUpperLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input (optional)
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Get the first character from user input

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }

        sc.close();
    }
}