package com.java.sm.advanced.functional;

interface calculator
{
    int ope (int a, int b);
}
public class Opertion {
    public static void main(String[] args) {
        calculator c = (a,b) -> a+b;
        calculator c2 = (a,b) -> a-b;

        System.out.println("Add is "+c.ope(5,3));
        System.out.println("Substract is "+ c2.ope(10,5));

    }
}
