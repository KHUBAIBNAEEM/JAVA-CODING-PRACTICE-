public class NumberSwapXOR {
    public static void main(String[] args) {
        int a = 3, b = 11;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + ", b: " + b);
    }
}
