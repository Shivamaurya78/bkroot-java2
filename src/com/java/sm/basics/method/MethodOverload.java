package com.java.sm.basics.method;


public class MethodOverload {
    int add(int a , int b)
    {
        return  a+b;
    }
    int add(int a , int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading ");
        MethodOverload m = new MethodOverload();

        m.add(4,3,2);
        System.out.println( m.add(5,3));
        System.out.println(m.add(4,3,2));

    }
}
