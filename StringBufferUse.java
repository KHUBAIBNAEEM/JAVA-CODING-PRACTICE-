public class StringBufferUse {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(5, 10); // will delete from 5 to 9
        System.out.println("Modified StringBuffer: " + sb.toString());
    
    }
    
}
