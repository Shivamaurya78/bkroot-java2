package com.java.sm.oops.inheritance;
// problme question
class Vehicle{
    void move()
    {
        System.out.println("vehicla is moving .. ");
    }
}
class Car extends Vehicle
{
    void fuel()
    {
        System.out.println("Car is moving... ");

    }
}
public class Problem {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        c.fuel();
    }
}
