// Create a program to count the set bits in an integer using bitwise operators

public class CountBit {
        public static void main(String[] args) {
            int num = 29; // Binary: 11101
            int count = 0;
    
            while (num > 0) {
                count += num & 1; // Check the last bit
                num >>= 1;        // Right shift
            }
            System.out.println("Set bits count: " + count); // Output: 4
        }
    }
