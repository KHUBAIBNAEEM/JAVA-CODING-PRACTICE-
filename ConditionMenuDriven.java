import java.util.Scanner;

public class ConditionMenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Apple 1");
        System.out.println("2. Banana 2");
        System.out.println("3. Orange 3");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("You selected Apple ");
        } else if (choice == 2) {
            System.out.println("You selected Banana ");
        } else if (choice == 3) {
            System.out.println("You selected Orange ");
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
