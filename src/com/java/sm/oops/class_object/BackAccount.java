package com.java.sm.oops.class_object;

public class BackAccount {
    double balance;

    void deposit(double amount)
    {
        balance +=amount;
    }
    void withdraw (double amount)
    {
        balance -=amount;
    }
    void display()
    {
        System.out.println("your balance is " +balance);
    }

    public static void main(String[] args) {
        BackAccount ba = new BackAccount();
        ba.deposit(5000);
        ba.withdraw(3000);
        ba.display();
    }
}
