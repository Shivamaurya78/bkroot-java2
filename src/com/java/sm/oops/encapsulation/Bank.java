package com.java.sm.oops.encapsulation;

public class Bank {
    private int balance;
    public void setDeposit (int amount)
    {
        balance += amount;
    }
    public  void setWithdraw(int amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else {
            System.out.println("Insuffiecent balance..");
        }
    }
    public int getBalance()
    {
        return balance;
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setDeposit(2000);
//        b.setWithdraw(1400);
//        b.setWithdraw(600);
        System.out.println(b.getBalance());
    }
}
