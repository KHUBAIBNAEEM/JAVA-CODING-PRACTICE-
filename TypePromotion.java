//Write a program to perform type promotion in expressions
public class TypePromotion {
    public static void main(String[] args) {
        int a = 12;
        char c = 'A';
        int result = a + c; // a and c are type promoted to int
        System.out.println(result);
    }
}
