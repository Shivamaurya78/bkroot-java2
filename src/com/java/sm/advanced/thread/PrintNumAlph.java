package com.java.sm.advanced.thread;

class Number implements Runnable {
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("Number is " +i);
        }
    }
}
class Alph implements Runnable {
    public void run()
    {
        for(char c = 'A'; c<='F'; c++)
        {
            System.out.println("Alphabet is "+c);
        }
    }
}
public class PrintNumAlph {
    public static void main(String[] args) {
        Thread t = new Thread(new Number());
        Thread t2 = new Thread(new Alph());
        t.start();
        t2.start();

    }
}
