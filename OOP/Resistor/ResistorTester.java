package OOP.Resistor;

public class ResistorTester {

  // 330 Ω ±10 percent resistors
  public static final double NOMINAL_RESISTANCE = 330;
  public static final double TOLERANCE = 10;

  public static void main(String[] args) {
    System.out.printf(
      "\nNominal Resistance - %f, Tolerance - %f\n\n",
      NOMINAL_RESISTANCE,
      TOLERANCE
    );
    for (int i = 1; i <= 10; i++) {
      Resistor resistor = new Resistor(NOMINAL_RESISTANCE, TOLERANCE);

      System.out.printf(
        "Resistor - %2d\nActualResistance - %.2f\n\n",
        i,
        resistor.getActualResistance()
      );
    }
  }
}
