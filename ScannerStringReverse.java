import java.util.Scanner;
public class ScannerStringReverse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your sentence or name to get reversed: ");
    String s1 = sc.nextLine();
    System.out.println(new StringBuilder(s1).reverse().toString());
    sc.close();
}

}
