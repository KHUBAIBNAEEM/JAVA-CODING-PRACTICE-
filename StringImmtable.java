public class StringImmtable {
    public static void main(String[] args) {
        
    String str = "hello";
        String modified = str.concat(" world");
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modified);
}
}

