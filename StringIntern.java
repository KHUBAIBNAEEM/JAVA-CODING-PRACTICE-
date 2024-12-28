public class StringIntern {
    public static void main(String[] args) {
        String str1 = new String("hello").intern(); //intern() method creates an exact copy of a string located in the heap memory and stores it in the string constant pool
        String str2 = "hello";
        System.out.println("Are they the same reference? " + (str1 == str2));
    }
    
}
