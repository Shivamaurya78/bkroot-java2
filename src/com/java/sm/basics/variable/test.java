package com.java.sm.basics.variable;

public class test {
    static   String course;   // static varibale
    int age  ;    // instance variable
    void display()
    {
        System.out.println("My age is " +age);
        System.out.println("My course is " +course);
    }

    public static void main(String[] args) {
        int weight = 68;  // local variable
        System.out.println("Shiva weight is "+weight);
        test t1 = new test();  // call the object
//        test t2  = new test();
        t1.course = "java";  // not assigne take only one
        t1.course = "python";
        t1.age = 22;
        t1.display();
    }
}
