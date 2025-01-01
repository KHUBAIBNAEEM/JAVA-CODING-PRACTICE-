import java.util.Scanner;

public class ConditionValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long, contain an uppercase letter and a digit.");
        }
        scanner.close();
    
}
}
