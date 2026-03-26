package com.java.sm.advanced.thread;

class Even implements Runnable{
    public  void run()
    {
        for(int i = 2; i<=10; i+=2)
        {
            System.out.println("Even number is "+i);
        }
    }
}
class Odd implements Runnable{
    public void run()
    {
        for(int  i = 1; i<=9; i+=2){
        System.out.println("Odd number is "+i);
    }
    }
}
class Natural implements Runnable{
    public  void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println("Naturla number is " +i);
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
     Thread t1 = new Thread(new Even());
        Thread t2 = new Thread(new Odd());
        Thread t3 = new Thread(new Natural());


        t1.start();
        System.out.println();
        t2.start();
        System.out.println();
        t3.start();
    }
}
