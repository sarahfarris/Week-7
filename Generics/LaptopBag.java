package Generics;

import java.util.List;

public class LaptopBag {
  List<Laptop> items;

  public LaptopBag(List<Laptop> items) {
    this.items = items;
  }

  public void add(Laptop laptop) {
    items.add(laptop);
  }

  public List<Laptop> getItems() {
    return items;
  }

  public void setItems(List<Laptop> items) {
    this.items = items;
  }

  public void printContents() {
    System.out.println("Laptops: ");
    if (items.isEmpty()) {
      System.out.println("The bag is empty");
    } else {
      for (Laptop laptop : items) {
        System.out.println(laptop);
      }
    }
  }
}
