package com.java.sm.basics.constructor;

public class Overloading {
    String name;
    int age;

    Overloading()
    {  }
    Overloading(String name)
    {
        this.name =name;
        System.out.println(name);
    }
    Overloading(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
   void display()
   {
       System.out.println("Ny name is "+name+" age is "+age);
   }
    public static void main(String[] args) {
    Overloading o = new Overloading();
    Overloading o2 = new Overloading("Shiva Maurya");
    Overloading o3  = new Overloading("Shiva Maurya", 21);
    }
}
