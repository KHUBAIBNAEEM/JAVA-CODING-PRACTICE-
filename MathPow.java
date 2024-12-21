//Demonstrating the use of Math.pow() to calculate exponents:
import java.util.Scanner;
public class MathPow {
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the exponent: ");
            double exponent = scanner.nextDouble();
    
            double result = Math.pow(base, exponent); // base and power is exponent
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }
