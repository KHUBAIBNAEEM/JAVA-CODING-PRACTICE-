import java.util.Scanner;
public class ConditionDivisibleFiveEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Example number
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }
        sc.close();
    }
}
