// 16. Calculate electricity bill based on consumption
class ElectricityBill {
    public static void main(String[] args) {
        int units = 150; // Units consumed
        double rate = 5.5; // Cost per unit
        double bill = units * rate;
        System.out.println("Electricity Bill: " + bill);
    }
}