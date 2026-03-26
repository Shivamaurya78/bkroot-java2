package com.java.sm.basics.constructor;

public class Test {
    double length;
    double width;
    Test()
    {
        length = 23.42;
        width = 34.2;
    }
    Test(double length)
    {
        this.length = length;
    }
    Test(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    void name(){
        System.out.println("Length is "+length+" and widht is "+width);
    }
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test(78);
        Test t3 = new Test(89.6,86.3);
        t.name();
        t2.name();
        t3.name();

    }
}
