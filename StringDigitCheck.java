public class StringDigitCheck {
    public static void main(String[] args) {
        String str = "1234a5";
        System.out.println("Contains only digits? " + str.matches("\\d+"));
    }
}
