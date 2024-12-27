import java.util.Scanner;

public class ScannerPalindromeCheck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence to check if it's a palindrome: ");
    String sentence = sc.nextLine();

    // Reverse the sentence (ignoring case)
    String reversed = new StringBuilder(sentence.toLowerCase()).reverse().toString();

    // Check if the original and reversed strings are equal (ignoring case)
    if (sentence.toLowerCase().equals(reversed)) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }

    sc.close();
  }
}