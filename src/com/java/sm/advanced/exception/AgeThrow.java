package com.java.sm.advanced.exception;

class Test2 {

    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        } else {
            System.out.println("Eligible");
        }
    }
}

public class AgeThrow {
    public static void main(String[] args) {

        Test2 t = new Test2();

        try {
            t.checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}