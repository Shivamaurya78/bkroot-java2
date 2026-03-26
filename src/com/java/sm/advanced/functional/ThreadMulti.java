package com.java.sm.advanced.functional;

public class ThreadMulti {
    public static void main(String[] args) {
        Thread t = new Thread(() ->
        {
            for(int i = 1; i<=5; i++)
                System.out.println("Thread is : " + i);
        });
        t.start();
    }
}
