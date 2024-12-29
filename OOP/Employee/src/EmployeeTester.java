/**
 * To Test Employee Class & Subclasses for Final Exam
 *
 * @author Aashray Bavisa
 * @since 15 August, 2023
 */
public class EmployeeTester {
    public static void main(String[] args) {
        // #1
        System.out.println("Employee Tester for Week 1\n-------------------------------------------------");
        // #2
        Supervisor S1 = new Supervisor("Darcy", "French", 176000, 105);
        Supervisor S2 = new Supervisor("Janelle", "Birch", 96000, 70);
        Worker W1 = new Worker("Daniel", "Van Patter", 2, 25.50, 41);
        Worker W2 = new Worker("Thomas", "Neil", 1, 45.50, 40);
        Worker W3 = new Worker("Judy", "Campbell", 1, 65.50, 41);
        Worker W4 = new Worker("John", "Greene", 2, 45.50, 45);
        // #3
        System.out.println(S1.toString());
        System.out.println();
        System.out.println(S2.toString());
        System.out.println();
        System.out.println(W1.toString());
        System.out.println();
        System.out.println(W2.toString());
        System.out.println();
        System.out.println(W3.toString());
        System.out.println();
        System.out.println(W4.toString());
        System.out.println();
        // #4
        S1.setProductionRate(115);
        S2.setProductionRate(110);
        W1.setHours(44);
        double newRate = W1.getRate() + 1.5;
        W1.setRate(newRate);
        W2.setHours(37);
        W3.setHours(42.75);
        W4.setHours(44);
        W4.setShift(1);
        // #5
        System.out.println("Employee Tester for Week 2\n-------------------------------------------------");
        // #6
        System.out.println(S1.toString());
        System.out.println();
        System.out.println(S2.toString());
        System.out.println();
        System.out.println(W1.toString());
        System.out.println();
        System.out.println(W2.toString());
        System.out.println();
        System.out.println(W3.toString());
        System.out.println();
        System.out.println(W4.toString());
        System.out.println();
    }
}
