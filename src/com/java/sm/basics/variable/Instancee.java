package com.java.sm.basics.variable;

public class Instancee {
    String name;
    int height;

    void display()
    {
        System.out.println(name+ " height is  " +height +" feet");
    }

    public static void main(String[] args) {
        Instancee s1 = new Instancee();
        s1.name = "Shiva";
        s1.height = 6;
        s1.display();

    }
}
