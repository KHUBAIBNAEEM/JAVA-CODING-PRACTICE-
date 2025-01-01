
import java.util.Scanner;
public class ConditionLastDigitClassfificaiton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int lastDigit = num % 10;
        
        if (lastDigit == 0) {
            System.out.println("The number ends with zero.");
        } else if (lastDigit % 2 == 0) {
            System.out.println("The number ends with an even digit.");
        } else {
            System.out.println("The number ends with an odd digit.");
        }
        scanner.close();
    }
}


