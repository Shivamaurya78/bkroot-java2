package com.java.sm.oops.polymorphism;

class Vehicla
{
    void start(){
        System.out.println("Vehicle is start");
    }
}
class Car extends Vehicla
{
    void start()
    {
        System.out.println("Car is start with key");
    }
}
class Bike extends Vehicla {
    void  start()
    {
        System.out.println("Bike is start with kick");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicla v = new Vehicla();
        v.start();
        v = new Car();
        v.start();
        v = new Bike();
        v.start();
    }
}
