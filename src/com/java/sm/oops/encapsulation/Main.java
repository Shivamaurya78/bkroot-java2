package com.java.sm.oops.encapsulation;

public class Main {
   private String name;
   private int age;
   public void setName(String name)
   {
       this.name = name;
   }
   public  String getName()
   {
       return name;
   }
   public void setAge (int age)
   {
       this.age = age;
   }
   public int getAge()
   {
       return age;
   }
    public static void main(String[] args) {
        Main m = new Main();
        m.setName("Shiva");
        m.setAge(21);
        System.out.println("My name is "+m.getName()+" and age is "+m.getAge());
    }
}
