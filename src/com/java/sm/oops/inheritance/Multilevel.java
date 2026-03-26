package com.java.sm.oops.inheritance;
// Multilevel Inheritance
class Animaal{
    void eat()
    {
        System.out.println("Eating ....");
    }
}
class Dog extends Animaal{
    void bark()
    {
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog{
    void weap()
    {
        System.out.println("Weaping...");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();;
        bd.bark();
        bd.weap();
    }
}
