package com.java.sm.oops.class_object;

public class Student {
    String name;
    int clas;

    void dsiplay()
    {
        System.out.println("Student name is "+name+" class is " +clas);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Shiva Maurya";
        s.clas=12;
        s.dsiplay();
    }
}
