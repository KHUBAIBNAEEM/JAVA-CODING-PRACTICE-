import java.util.Scanner;
public class ASCIIvalue {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter the character and get the ASCII number");
char ch = sc.next().charAt( 0);
int a = ch;
System.out.println("THE ASCII Number is\s" + a);

}
}
