import java.util.Scanner;

public class ScannerFloat {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println(f);
        sc.close();
    
    }
    
}
