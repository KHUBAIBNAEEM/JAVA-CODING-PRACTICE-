import java.util.Scanner;

public class ConditionTriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();
        
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        scanner.close();
    }
}

