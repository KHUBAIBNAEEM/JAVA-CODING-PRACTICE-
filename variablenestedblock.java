// Demonstrate variable shadowing in nested blocks.

public class variablenestedblock {
public static void main(String[] args) {

int x = 10; {
    int y = 12;
    System.out.println("INNER: " + x);
}
System.out.println("OUTER: " + x);
    
}
}
