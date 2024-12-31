import java.util.Scanner;
public class ConditionLargestNumber {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Enter third number: ");
    int c = sc.nextInt();
    if (a >= b && a >= c){
        System.out.println("The first number " + a + "is greater than" + b);
    }
    else if(b >= a && b >= c){
        System.out.println("The second number " + b + "is greater than" + c);
    }
    else if(c>a){
        System.out.println("The third number " + c + "is the largest");
    }
    sc.close();
    }   
}
