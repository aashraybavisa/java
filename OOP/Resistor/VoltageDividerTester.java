package OOP.Resistor;

public class VoltageDividerTester {

  // voltage dividers each consisting of 5% resistors having nominal values R1 = 250 Ω and R2 = 750 Ω.
  public static final double NOMINAL_RESISTANCE1 = 250;
  public static final double TOLERANCE1 = 5;
  public static final double NOMINAL_RESISTANCE2 = 750;
  public static final double TOLERANCE2 = 5;

  public static void main(String[] args) {
    System.out.printf(
      "\nNominal Resistance1 - %.2f, Tolerance1 - %.2f\n",
      NOMINAL_RESISTANCE1,
      TOLERANCE1
    );
    System.out.printf(
      "\nNominal Resistance2 - %.2f, Tolerance2 - %.2f\n\n",
      NOMINAL_RESISTANCE2,
      TOLERANCE2
    );
    for (int i = 1; i <= 10; i++) {
      Resistor resistor1 = new Resistor(NOMINAL_RESISTANCE1, TOLERANCE1);
      Resistor resistor2 = new Resistor(NOMINAL_RESISTANCE2, TOLERANCE2);

      VoltageDivider voltageDivider = new VoltageDivider(
        resistor1,
        resistor2,
        NOMINAL_RESISTANCE1,
        TOLERANCE1,
        NOMINAL_RESISTANCE2,
        TOLERANCE2
      );

      System.out.printf("VoltageDivider - %3d\n", i);
      System.out.printf(
        "ActualResistance1 - %.2f , ActualResistance2 - %.2f\n",
        resistor1.getActualResistance(),
        resistor2.getActualResistance()
      );
      System.out.printf(
        "NominalGain - %.2f\nActualGain - %.2f\n\n",
        voltageDivider.getNominalGain(),
        voltageDivider.getActualGain()
      );
    }
  }
}
