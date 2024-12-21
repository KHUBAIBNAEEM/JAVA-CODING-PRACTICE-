//  Demonstrate precedence and associativity of operators in a program

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // Multiplication has higher precedence
        System.out.println("10 + 5 * 2 = " + result); // Output: 20

        int result2 = (10 + 5) * 2; // Parentheses change precedence
        System.out.println("(10 + 5) * 2 = " + result2); // Output: 30
    }
}