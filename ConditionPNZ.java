import java.util.Scanner;

public class ConditionPNZ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("The Given number is positive: " + num);
        }
        else if (num < 0){
            System.out.println("The Given number is negative: " + num);
        }
        else {
            System.out.println("The Given number is Zero: " + num);
    }

           
    }
}