package OOP.Resistor;

public class VoltageDivider {

  private Resistor resistor1;
  private Resistor resistor2;
  private double nominalGain;
  private double actualGain;

  public VoltageDivider(
    Resistor resistor1,
    Resistor resistor2,
    double nominalResistance1,
    double tolerance1,
    double nominalResistance2,
    double tolerance2
  ) {
    this.resistor1 = resistor1;
    this.resistor2 = resistor2;

    this.nominalGain =
      (nominalResistance2) / (nominalResistance1 + nominalResistance2);
    this.actualGain =
      (this.resistor2.getActualResistance()) /
      (this.resistor1.getActualResistance() + this.resistor2.getActualResistance());
  }

  /**
   * @return double
   */
  public double getNominalGain() {
    return nominalGain;
  }

  /**
   * @return double
   */
  public double getActualGain() {
    return actualGain;
  }
}
