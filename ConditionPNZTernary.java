// variable = Expression1 ? Expression2: Expression3
import java.util.Scanner;
public class ConditionPNZTernary{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            String result = (num>0) ? "Positive" : (num<0) ? "Negative" : "zero";
            System.out.println("The Number is: " + result);
        sc.close();
        } catch (Exception e) {
            System.out.println("InValid Number.....");
        }
        
    }
}