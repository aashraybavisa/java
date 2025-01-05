package OOP.Resistor;

// Science P8.26
public class Resistor {

  private double nominalResistance;
  private double tolerance;
  private double actualResistance;

  public Resistor(double nominalResistance, double tolerance) {
    this.nominalResistance = nominalResistance;
    this.tolerance = tolerance;

    double randomizedTolerance =
      (Math.random() * 2 - 1) *
      (0.01 * this.tolerance * this.nominalResistance); // (getting random value between -1 to 1) * (unit resistance value with tolerance)
    this.actualResistance = this.nominalResistance + randomizedTolerance;
  }

  /**
   * @return double
   */
  public double getNominalResistance() {
    return this.nominalResistance;
  }

  /**
   * @return double
   */
  public double getTolerance() {
    return this.tolerance;
  }

  /**
   * @return double
   */
  public double getActualResistance() {
    return this.actualResistance;
  }
}
