import java.util.Scanner;

public class ConditionVoter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
    }
}
// https://chatgpt.com/share/6773c6cd-a5f0-800a-bdb4-b71dbe0b0904 