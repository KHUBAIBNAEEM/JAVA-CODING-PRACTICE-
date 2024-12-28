public class StringRepeatingChar{
    public static void main(String[] args) {
        String str = "swiss";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}