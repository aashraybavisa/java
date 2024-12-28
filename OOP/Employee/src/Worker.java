/**
 * To create subclass Worker of Employee parent class for Final exam
 *
 * @author Aashray Bavisa
 * @since 15 August, 2023
 */
public class Worker extends Employee {
    // Defining variables
    private int shift;
    private double rate;
    private double hours;

    // Constructor
    /**
     * Custom Constructor
     * 
     * @param first First Name
     * @param last  Last Name
     * @param shift Shift Time
     * @param rate  Hourly Rate
     * @param hours Hours Worked
     */
    public Worker(String first, String last, int shift, double rate, double hours) {
        super("Worker", first, last);
        this.shift = shift;
        this.rate = rate;
        this.hours = hours;
    }

    // Access and Set Methods
    /**
     * Get Shift
     * 
     * @return int
     */
    public int getShift() {
        return shift;
    }

    /**
     * Set Shift
     * 
     * @param shift shift
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * Get Rate
     * 
     * @return double
     */
    public double getRate() {
        return rate;
    }

    /**
     * Set Rate
     * 
     * @param rate Rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Get Hours Worked
     * 
     * @return double
     */
    public double getHours() {
        return hours;
    }

    /**
     * Set Hours
     * 
     * @param hours Hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    // Abstract Method
    public double calculateGrossPay() {
        double finalRate = this.getShift() == 2 ? this.getRate() * (1.03) : this.getRate();
        return finalRate * this.getHours();
    }

    // Overridden Methods
    public String toString() {
        String shiftString = this.getShift() == 2 ? "night (shift premium)" : "day (no premium)";
        return String.format("%s\n%-20s%s\n%-20s$%,.2f\n%-20s%.1f\n%-20s$%,.2f\n%-20s$%,.2f", super.toString(),
                "Shift:", shiftString, "Hourly Pay Rate:", this.getRate(), "Hours Worked", this.getHours(),
                "Gross Pay:", this.calculateGrossPay(), "Net Pay:", super.calculateNetPay());
    }
}
