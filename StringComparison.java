// Program to compare strings using relational operators and equals method:

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Using equals method
        if (str1.equals(str2)) {
            System.out.println("The strings are equal (equals method).");
        } else {
            System.out.println("The strings are not equal (equals method).");
        }

        /* // Using relational operator
        int comparison = str1.compareTo(str2);
        if (comparison == 0) {
            System.out.println("The strings are equal (relational operator).");
        } else if (comparison > 0) {
            System.out.println("The first string is greater.");
        } else {
            System.out.println("The second string is greater.");
        } */
    }
}
 
