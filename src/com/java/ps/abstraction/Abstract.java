package com.java.ps.abstraction;

abstract class Bank {
    abstract void calculateInterest(); // rule banaya
}

class SBI extends Bank {
    void calculateInterest() {
        System.out.println("SBI Interest: 5%");
    }
}

class HDFC extends Bank {
    void calculateInterest() {
        System.out.println("HDFC Interest: 7%");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.calculateInterest();

        b = new HDFC();
        b.calculateInterest();
    }
}
