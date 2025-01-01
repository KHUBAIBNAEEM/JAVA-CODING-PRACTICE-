import java.util.Scanner;

public class LoopSumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = sc.nextLong();
        long sum = 0;
        for (long i = 0; i<=num; i++){
            sum += i;
            System.out.println(sum);
        }
        sc.close();
        
    }
    
}
