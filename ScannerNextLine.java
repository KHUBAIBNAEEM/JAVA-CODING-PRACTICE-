import java.util.Scanner;
public class ScannerNextLine {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your desired sentence: ");
    String Sentence = sc.nextLine();
    System.out.println(Sentence);
    sc.close();
} 
}
