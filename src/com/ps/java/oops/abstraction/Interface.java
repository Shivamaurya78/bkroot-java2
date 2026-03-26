package com.ps.java.oops.abstraction;

interface Animal {
    void sound();   // by default abstract
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
