package com.java.sm.basics.method;
class A {
    void show ()
    {
        System.out.println("A");
    }
}
class B extends A{
    void show()
    {
        System.out.println("B.");
    }
}
public class MethodOverride2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

    }
}
