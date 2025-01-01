import java.util.Scanner;

public class ConditionElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the units of electricity consumed: ");
        int units = scanner.nextInt();
        
        double bill = 0;
        
        if (units <= 50) {
            bill = units * 0.5;
        } else if (units <= 150) {
            bill = 50 * 0.5 + (units - 50) * 1;
        } else if (units <= 250) {
            bill = 50 * 0.5 + 100 * 1 + (units - 150) * 1.5;
        } else {
            bill = 50 * 0.5 + 100 * 1 + 100 * 1.5 + (units - 250) * 2;
        }
        
        System.out.println("The electricity bill is: " + bill);
        scanner.close();
    }
}
