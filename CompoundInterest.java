// Write a program to calculate compound interest.

class CompoundInterest {
    public static void main(String[] args) {
        double principal = 100_0_0.99_00; // Principal amount
        double rate = 5.5; // Annual interest rate in percent
        int time = 6; // Time in years
        double compoundInterest = principal * Math.pow(1 + (rate / 100), time);

        // Math.pow is use to calculate the power of the variable
        // for example a = 2,b = 3 so if 2 power 3 then, Math.pow(2,3)        
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
