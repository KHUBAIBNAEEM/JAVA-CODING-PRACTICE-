import java.util.Scanner;
public class ConditionStringAlphabetsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if (str.matches("[a-zA-Z]+")){
            System.out.println("YES");
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
    
}
