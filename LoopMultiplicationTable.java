import java.util.Scanner;
public class LoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int nm = sc.nextInt();
        for (int i=0; i<=10; i++){
            int multiplication = nm *  i;
            System.out.println(nm + "x" + i + "=" + multiplication);
        }
        sc.close();
        
    }
}
