public class StringReverse{
    public static void main(String[] args) {
        String ss = "Hello jee kese ho";
        String sr = new StringBuilder(ss).reverse().toString();
        System.out.println("The reversed String is: " + sr);
    }

}