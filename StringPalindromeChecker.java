public class StringPalindromeChecker {
    public static void main(String[] args) {
        String s1 = "MADAM";
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s1.equals(s2));
        
    }
    
}
