import java.util.Scanner;
public class ConditionEvenOdd {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter The Number: ");
    long num = sc.nextLong();
    if (num % 2 == 0) {
        System.out.println("The Number Is Even");
    }
    else if(num/2 != 0){
        System.out.println("The Number Is Odd: ");
    }
    else{
        System.out.println("Invalid Number");
    }
    sc.close();
    
   } 
}
