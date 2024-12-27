import java.util.Scanner;
public class ScannerCountStringLength {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Sentence to get the length: ");
    String wordcount = sc.nextLine();
    int nonSpaceCount = wordcount.replaceAll("\\s+", "").length();

    System.out.println(nonSpaceCount);
    sc.close();
}
}
