import java.util.Scanner;
public class ConditionLeapYear {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int Year = sc.nextInt();
    if (Year == 365){
        System.out.println("The Normal Year");
    }
    else if(Year == 366){
        System.out.println("The Leap Year");
    }
    else{
        System.out.println("Invalid Number");
    }
    sc.close();
    }
}
