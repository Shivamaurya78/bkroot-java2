package com.java.sm.basics.constructor;

public class Test2 {
    String name;
    int rollno;

    Test2(String name, int rollno)
    {
        this.name = name;
        this.rollno =rollno;
    }
    void display()
    {
        System.out.println("My name is " +name+" and my rollno is " +rollno);
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2("Shiva",22);
        t2.display();
    }
}
