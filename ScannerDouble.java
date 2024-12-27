// 13. Read a double value and format it to two decimal places
import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double number = scanner.nextDouble();

        System.out.printf("Formatted value: %.2f%n", number);
        scanner.close();
    }
}
