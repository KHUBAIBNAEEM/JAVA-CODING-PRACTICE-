//  Write a program to calculate the sum of integers entered by the user until a negative number 

import java.util.Scanner;
public class ScannerSumIntUntilNegative {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter your second number: ");
    int num2 = sc.nextInt();

    if (num1 + num2 >0){
        System.out.println("The total number is: " + (num1 + num2));
    }
    else{
        System.out.println("Error.....Correct your numbers");
    }
    sc.close();
}    
}
