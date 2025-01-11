class Calculator {

    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method for division
    public static double divide(int a, int b) {
        return (double) a / b;
    }

}

public class ClassesCalculator {
    public static void main(String[] args) {

        System.out.println("Addition: " + Calculator.add(10, 5));
        System.out.println("Subtraction: " + Calculator.subtract(10, 5));
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
        System.out.println("Division: " + Calculator.divide(10, 5));
    }
}
