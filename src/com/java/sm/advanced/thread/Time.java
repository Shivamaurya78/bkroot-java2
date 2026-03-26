package com.java.sm.advanced.thread;

class NumberDelay implements Runnable{
    public  void run()
    {
        for(int i = 1; i<=5; i++) {
            System.out.println("Number is " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }
}
public class Time {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberDelay());
        t.start();

    }
}
