package com.ps.java.oops.abstraction;

abstract class Car {
    abstract void start();  // abstract method

    void stop() {
        System.out.println("Car stopped");
    }
}
//inheritance use
class BMW extends Car {
    void start() {
        System.out.println("BMW starts with button");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new BMW();
        c.start();
        c.stop();
    }
}
