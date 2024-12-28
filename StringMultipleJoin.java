public class StringMultipleJoin {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "IS";
        String s3 = "GREAT";

        String sj = String.join(s1, s2, s3);
        System.out.println(sj);
    }
    
}
