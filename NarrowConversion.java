public class NarrowConversion {
    public static void main(String[] args) {
        double doubleValue = 3.141599999999999999;
        float floatValue = (float) doubleValue; 

        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue); 
        // Possible loss of precision due to narrowing
    }
}
