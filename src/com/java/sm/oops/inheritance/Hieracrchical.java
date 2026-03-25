package com.java.sm.oops.inheritance;
// Hierchical Inheritance
class GrandFather{
    void height()
    {
        System.out.println("Is height is 6 foot");
    }
}
class Father extends GrandFather
{
    void color()
    {
        System.out.println("skin color is medium");
    }
}
class son extends GrandFather
{
    void speak()
    {
        System.out.println("Speaking is good..");
    }
}
public class Hieracrchical {
    public static void main(String[] args) {
      son s = new son();
      Father f = new Father();
      f.height();
      f.color();

      s.speak();
      s.height();
    }
}
