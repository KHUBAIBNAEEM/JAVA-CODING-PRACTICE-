// Calculate Body Mass Index (BMI)

class BMI {
    public static void main(String[] args) {
        double weight = 70; // in kilograms
        double height = 1.75; // in meters
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
