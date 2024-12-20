/**
 * Aashray Bavisa
 * July, 2023
 * To create a superclass from which subclasses will be derived
 */

public class Shape {

  private String type;
  private Colour colour;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Colour getColour() {
    return colour;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }

  //0-arg constructor
  public Shape() {
    type = "Shape";
    colour = Colour.BLACK;
  }

  //1-arg constructor
  public Shape(String type) {
    this.type = type;
    colour = Colour.BLACK;
  }

  //2-arg constructor
  public Shape(String type, Colour colour) {
    this.type = type;
    this.colour = colour;
  }

  //Override Object's toString()
  public String toString() {
    String output = String.format("%-10s%s\n", "Type:", type);
    output += String.format("%-10s%s\n", "Colour:", colour);

    return output;
  }
}
