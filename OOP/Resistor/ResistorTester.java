package OOP.Resistor;

public class ResistorTester {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      Resistor reg = new Resistor(330, 10);

      System.out.printf(
        "Resistor - %2d\nActualResistance - %.2f\n\n",
        i,
        reg.getActualResistance()
      );
    }
  }
}
