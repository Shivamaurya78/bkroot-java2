package com.java.sm.advanced.exception;

public class Exam {
    public static void main(String[] args) {
       Test e  = new Test();   // call Diveide class
        e.display(10,5);
        e.display(48,0);
        System.out.println();

        // call the array classs
        int arr[] = {2,3,4,5};
        Testt t = new Testt();
        t.getElement(arr,3);
        System.out.println();

        // call the age class
        age a = new age();
        a.checkAge(15);
        a.checkAge(21);
    }



}
