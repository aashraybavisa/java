/**
 * To create subclass Supervisor of Employee parent class for Final Exam
 *
 * @author Aashray Bavisa
 * @since 15 August, 2023
 */
public class Supervisor extends Employee {
    // Declare variables
    private double salary;
    private int productionRate;

    // Constructor
    /**
     * Custom Constructor
     * @param first First Name
     * @param last Last Name
     * @param salary Annual Salary
     * @param productionRate Production Rate
     */
    public Supervisor(String first, String last, double salary, int productionRate) {
        super("Supervisor", first, last);
        this.salary = salary;
        this.productionRate = productionRate;
    }

    // Access and Set Methods
    /**
     * Get Salary
     * @return double
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set Salary
     * @param salary Salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Get Production Rate
     * @return int 
     */
    public int getProductionRate() {
        return productionRate;
    }

    /**
     * Set Production Rate
     * @param productionRate Production Rate
     */
    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }

    // Methods
    /**
     * Calculate Bonus
     * @return double
     */
    private double calculateBonus() {
        int bonusRate = this.getProductionRate() < 75 ? 0
                : this.getProductionRate() <= 100 ? 5 : this.getProductionRate() <= 120 ? 15 : 0;
        double weeklySalary = (this.getSalary() / (double) 50);
        return (double) bonusRate * 0.01 * weeklySalary;
    }

    // Abstract Method
    public double calculateGrossPay() {
        double weeklySalary = (this.getSalary() / (double) 50);
        return weeklySalary + this.calculateBonus();
    }

    // Overridden Methods
    public String toString() {
        // double amount = this.getSalary();
        // String strSalary = "";
        // if (amount > 1000) {
        // strSalary = String.format("%.2f", (double) (amount - (int) amount)) (int)
        // (amount / 1000) + ",000" + (double) (amount - (int) amount);
        // }
        return String.format("%s\n%-20s$%,.2f\n%-20s%s\n%-20s$%,.2f\n%-20s$%,.2f", super.toString(), "Salary:",
                this.salary,
                "Production Rate:", this.getProductionRate() + "%", "Gross Pay:", this.calculateGrossPay(), "Net Pay:",
                super.calculateNetPay());
    }
}
