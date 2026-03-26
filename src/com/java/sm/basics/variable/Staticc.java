package com.java.sm.basics.variable;

public class Staticc {
    static String college = "BGI";  // Static variable
    String name ;

    void display()
    {
        System.out.println(name+ " admission in " +college);
    }

    public static void main(String[] args) {
        Staticc s1 = new Staticc();
        s1.name = "Shiva";
        Staticc s2 = new Staticc();
        s2.name = "Aadi";

        s1.display();
        s2.display();

    }

}
