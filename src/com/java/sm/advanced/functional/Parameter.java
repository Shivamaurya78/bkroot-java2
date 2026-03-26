package com.java.sm.advanced.functional;

interface Add
{
    int sum (int c, int b);
}
public class Parameter {
    public static void main(String[] args) {
        Add a = (c,b) -> c+b;
        System.out.println(a.sum(10,10));

    }
}
