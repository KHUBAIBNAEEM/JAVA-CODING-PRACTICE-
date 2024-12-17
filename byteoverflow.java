// Demonstrate overflow in byte variables

public class byteoverflow {
public static void main (String args[]){
    byte a = 127;
    a++;
    System.out.println(a); // THE RANGE OF BYTE IS FROM 0-127 = output -128
}
    
}
