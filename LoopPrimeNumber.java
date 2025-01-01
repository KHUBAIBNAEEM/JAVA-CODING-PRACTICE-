import java.util.Scanner;

public class LoopPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range:");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
        scanner.close();
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false; // Divisible by another number
        }
        return true; // Prime if no divisors found
    }
}
