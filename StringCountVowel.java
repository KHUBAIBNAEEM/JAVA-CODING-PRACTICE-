public class StringCountVowel {
    public static void main(String[] args) {
    String str = "Hello World";
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    
    }
}
