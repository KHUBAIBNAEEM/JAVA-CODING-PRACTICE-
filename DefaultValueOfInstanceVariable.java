//Create a program to demonstrate default values of instance variables.

class DefaultValue{
    int number; // deafult value is 0
    boolean flag; // default is false
    char c = 'K';
    String alpha = "KHUBAIB";
}

public class DefaultValueOfInstanceVariable {
    public static void main(String[] args) {
        DefaultValue obj = new DefaultValue();
        System.out.println("Number: " + obj.number);
        System.out.println("Flag: " + obj.flag);
        System.out.println("char: " + obj.c);
        System.out.println("String: " + obj.alpha);
    }
    
}
