package com.java.sm.oops.class_object;

public class ConstructorUse {
  String brand;
  int price;

  ConstructorUse(String brand, int price)
  {
      this.brand = brand;
      this.price = price;
  }
  void display()
  {
      System.out.println("Car brand name is "+ brand+ " and price is " +price );
  }

    public static void main(String[] args) {
        ConstructorUse car = new ConstructorUse("Mahindra ", 5000000);

        car.display();



    }
}
