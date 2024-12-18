// Implement a calculator using switch-case and arithmetic operators.

import java.util.Scanner;
public class CalculatorProject {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Number: ");
double num1 = sc.nextDouble();
System.out.print("Enter Second Number: ");
double num2 = sc.nextDouble();
System.out.print("Enter operator (+, -, *, /): ");
char ch = sc.next().charAt(0);

// SWITCH CASE
switch (ch) {
    case '+' : System.out.println("Result: " + (num1 + num2)); break;
    case '-' : System.out.println("Result: " + (num1 - num2)); break;
    case '*' : System.out.println("Result: " + (num1 * num2)); break;
    case '/' : System.out.println("Result: " + (num1 / num2)); break;
    default: System.out.println("Invalid operator");
}
}   
}
