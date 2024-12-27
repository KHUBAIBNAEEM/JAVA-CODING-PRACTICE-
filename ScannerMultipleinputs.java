import java.util.Scanner;

public class ScannerMultipleinputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();

        System.out.print("Enter a floating-point number: ");
        float floatInput = scanner.nextFloat();

        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume the leftover newline
        String stringInput = scanner.nextLine();

        System.out.println("Integer: " + intInput);
        System.out.println("Float: " + floatInput);
        System.out.println("String: " + stringInput);

        scanner.close();
    }
}

