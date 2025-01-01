import java.util.Scanner;

public class ConditionTaxCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter income: ");
        double income = scanner.nextDouble();
        double tax = 0;
        
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.1;
        } else {
            tax = income * 0.2;
        }
        
        System.out.println("Tax to be paid: " + tax);
        scanner.close();

    }
    
}
