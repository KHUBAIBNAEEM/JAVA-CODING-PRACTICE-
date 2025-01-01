import java.util.Scanner;

public class ConditionRangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int range = sc.nextInt();
        if (range >= 0 && range <=100){
            System.out.println("You are in the range");
        }
        else {
            System.out.println("out of range");
        }
        sc.close();
    }
    
}
