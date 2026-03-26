package com.java.sm.advanced.exception;

class  InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class Bank
{
    int balance = 10000;
    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance)
        {
            throw  new InsufficientBalanceException("Balance is low");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdraw successfully");
        }
    }
}
public class UserDefine2 {
    public static void main(String[] args) {

        Bank b = new Bank();
        try {
            b.withdraw(70000);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
