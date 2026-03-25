package com.java.sm.oops.inheritance;
class Employee
{
    String name;
    int salary;
}
class Manager extends Employee{
    double bonus;
}
class Director extends Manager
{
    double stock;
}
public class Problem2 {
    public static void main(String[] args) {
   Director d = new Director();
   d.name = "Shiva Maurya";
   d.salary = 21;
   d.bonus = 2000;
   d.stock = 500;
        System.out.println(d.name+" is salary is "+d.salary+" bonus is "+d.bonus+ " and stock is "+d.stock);
    }
}
