public class ConditionVowelConsonant{
public static void main(String[] args) {
    char ch = 'a'; // Example character

    if ("AEIOUaeiou".indexOf(ch) != -1) {
        System.out.println(ch + " is a vowel.");
    } else if (Character.isLetter(ch)) {
        System.out.println(ch + " is a consonant.");
    } else {
        System.out.println(ch + " is not a letter.");
    }
}
}