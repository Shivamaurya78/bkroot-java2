package com.java.sm.oops.abstraction;
// Jiska object directly create na ho
// usem abstract methods ho sakte he
// normal method bhi ho sakt he
// unko inherit (extends) karn padta hei
// child class ko abstract method implement karn padat he


abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
   double radius;
    Circle(double r)
    {
        radius = r;
    }
   double area(){
        return 3.14 * radius * radius;
    }
}
class Reactangle extends Shape{
    double length, width;

    Reactangle(double l, double w)
    {
        length = l;
        width = w;
    }
    double area()
    {
        return length*width;
    }
}

public class Demo {
  public static void main(String[] args) {
      Shape s = new Circle(5);
      System.out.println(s.area());
      Shape s2 = new Reactangle(4.5,8.7);
      System.out.println(s2.area());
  }

}
