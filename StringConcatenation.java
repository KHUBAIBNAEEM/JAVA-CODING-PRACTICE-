public class StringConcatenation {
    public static void main(String[] args) {
        /* 1st Method:
         * String str1 = "Hello";
         * String st2 = "World";
            System.out.println(str1 + " " + str2); */

        // 2nd Method Using String Builder
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World"); //.append is use to add the extra data at the end of the string builder obj
        System.out.println(sb.toString()); //it returns the string representation of the obj

    }
    
}
