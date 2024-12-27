// 14. Read space-separated integers from the user
import java.util.Scanner;

public class ScannerSpaceSeparatedInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter space-separated integers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        System.out.println("You entered:");
        for (String num : numbers) {
            System.out.println(Integer.parseInt(num));
        }

        scanner.close();
    }
}
