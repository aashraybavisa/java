import java.util.Random;

/**
 * To define Employee Class for Final Exam
 *
 * @author Aashray Bavisa
 * @since 15 August, 2023
 */
public abstract class Employee {
    // Defining static variables

    public static final double EI_RATE = 0.0188;
    public static final double CPP_RATE = 0.0495;
    public static final double TAX_RATE = 0.2;
    public static final double RSP_RATE = 0.04;

    // Declaring variables
    private String level;
    private String first;
    private String last;
    private String empNum;

    // Constructor
    /**
     * Custom Constructor
     * @param level Level
     * @param first First Name
     * @param last Last Name
     */
    public Employee(String level, String first, String last) {
        this.level = level;
        this.first = first;
        this.last = last;

        setEmpNum();
    }

    // Access and Set Methods
    /**
     * Get String
     * @return String
     */
    public String getLevel() {
        return level;
    }

    /**
     * Set Level
     * @param level Level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Get First Name
     * @return String
     */
    public String getFirst() {
        return first;
    }

    /**
     * Set First Name
     * @param first First Name
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Get Last Name
     * @return String
     */
    public String getLast() {
        return last;
    }

    /**
     * Set Last Name
     * @param last Last Name
     */
    public void setLast(String last) {
        this.last = last;
    }


    /**
     * Get Employee Number
     * @return String
     */
    public String getEmpNum() {
        return empNum;
    }

    /**
     * Set Employee Number
     */
    private void setEmpNum() {
        String levelCode = (this.level.equals("Supervisor")) ? "SPR" : (this.level.equals("Worker")) ? "WKR" : "";
        // Name Initials : Last Name initials kept first as per the sample output
        String nameInits = this.last.substring(0, 2).toUpperCase() + this.first.substring(0, 2).toUpperCase();
        Random random = new Random();
        StringBuilder employeeNumber = new StringBuilder();
        for (int i = 0; i < 5; i++)
            employeeNumber.append(random.nextInt(10));
        String randomNum = employeeNumber.toString();
        this.empNum = levelCode + "-" + nameInits + "-" + randomNum;
    }

    // Abstract Methods
    /**
     *  To calculate Gross Pay
     * @return double
     */
    public abstract double calculateGrossPay();

    // Methods
    /**
     * EI
     * @return double
     */
    private double ei() {
        return EI_RATE * calculateGrossPay();
    }

    /**
     * CPP
     * @return double
     */
    private double cpp() {
        return CPP_RATE * calculateGrossPay();
    }

    /**
     * TAX
     * @return double
     */
    private double tax() {
        return TAX_RATE * (calculateGrossPay() - ei() - cpp());
    }

    /**
     * RSP 
     * @return double
     */
    private double rsp() {
        return RSP_RATE * (calculateGrossPay() - ei() - cpp() - tax());
    }

    /**
     * Calculate Net Pay
     * @return double
     */
    public double calculateNetPay() {
        return calculateGrossPay() - ei() - cpp() - tax() - rsp();
    }

    // Overridden Methods
    public String toString() {
        return String.format("%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s", "Employee Level:", this.level, "First Name:",
                this.first, "Last Name:", this.last, "Employee Number:", this.empNum);
    }
}
