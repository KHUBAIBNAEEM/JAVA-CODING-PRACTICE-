public class StringIndexNumber {
    public static void main(String[] args) {
        String s = "KHUBAIB BIN NAEEM";
        System.out.println("Index with spaces: " + s.indexOf('N'));
        int indexS = s.replaceAll(" ", "").indexOf('E');
        System.out.println("Index without Spaces: " + indexS);
    }
}