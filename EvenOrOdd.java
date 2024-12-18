// Create a program to check if a number is even or odd using the modulo operator

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
System.out.print("Enter your Number: ");
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
if (a % 2 == 0){ // if we divide the number by 2 and the reminder is 0 so even else odd
    System.out.println("Number is Even");
}
else{System.out.println("Number is odd");}
}   
}
    