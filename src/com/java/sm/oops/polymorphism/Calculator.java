package com.java.sm.oops.polymorphism;

class Operation {
    int mul (int a, int b)
    {
        return a*b;
    }
    int mul (int a, int b, int c)
    {
        return a*b*c;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Operation op = new Operation();
//        op.mul(5,8);
//        op.mul(3,4,6);
        System.out.println(op.mul(5,5));
        System.out.println(op.mul(3,6,8));

    }
}
