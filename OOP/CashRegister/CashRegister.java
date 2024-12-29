package OOP.CashRegister;

import java.util.ArrayList;

/**
    ­­­A simulated cash register that tracks the item count and ­­­the total amount due.
*/
public class CashRegister {

  //   private int itemCount;
  //   private double totalPrice;

  private ArrayList<Double> items;
  private int salesCount;
  private double salesTotal;

  public CashRegister() {
    // itemCount = 0;
    // totalPrice = 0;

    items = new ArrayList<Double>();
    salesCount = 0;
    salesTotal = 0;
  }

  public void addItem(double price) {
    // itemCount++;
    // totalPrice = totalPrice + price;

    items.add(price);
  }

  public void undo() {
    if (items.size() > 0) {
      items.remove(items.size() - 1);
    }
  }

  public double getTotal() {
    // return totalPrice;

    double sum = 0;
    for (double value : items) {
      sum = sum + value;
    }
    return sum;
  }

  public int getCount() {
    // return itemCount;

    return items.size();
  }

  public void displayAll() {
    for (double value : items) {
      System.out.println(value);
    }
  }

  public void completeTransaction() {
    if (items.size() > 0) {
      double currentTotal = getTotal();
      salesTotal = salesTotal + currentTotal;
      salesCount = salesCount + 1;
      clear();
    }
  }

  public void clear() {
    // itemCount = 0;
    // totalPrice = 0;

    items.clear();
  }

  public void resetSales() {
    salesCount = 0;
    salesTotal = 0;
  }
}
