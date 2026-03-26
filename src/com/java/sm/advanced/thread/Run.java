package com.java.sm.advanced.thread;
// implement by Runnable
class MyTask implements Runnable{
    public void  run()
    {
        System.out.println("task is running ....");
    }
}
public class Run {
    public static void main(String[] args) {
       Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}
