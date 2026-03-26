package com.java.sm.advanced.functional;

interface message{
    void show();
}

public class Main {
    public static void main(String[] args) {
        message m = () -> System.out.println("Jai Shree Ram");
        m.show();
    }
}
