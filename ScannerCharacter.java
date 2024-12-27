import java.util.Scanner;
public class ScannerCharacter {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any thing to get the character at 0 index: ");
    char c = sc.next().charAt(0);
    System.out.println(c);
    sc.close();
    }
}
