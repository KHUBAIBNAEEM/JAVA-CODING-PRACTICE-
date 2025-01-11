class Employee {
    private String names;
    private double basicSalary;
    private double allowances;

    // Constructor to initialize Employee attributes
    public Employee(String names, double basicSalary, double allowances) {
        this.names = names;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    // Method to calculate net salary (assuming 10% deduction)
    public double calculateNetSalary() {
        double deductions = 0.1 * basicSalary;
        return calculateGrossSalary() - deductions;
    }

    // Method to display salary details
    public void displaySalaryDetails() {
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class ClassesEmployeeSalary {
    public static void main(String[] args) {
        Employee obj4 = new Employee("Mia", 13000_99.9, 1000.0);
        obj4.calculateGrossSalary();
        obj4.calculateNetSalary();
        obj4.displaySalaryDetails();

    }
    
}
