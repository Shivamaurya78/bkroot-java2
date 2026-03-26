package com.java.sm.oops.abstraction;

abstract  class Bank{
    abstract int getInterest();
}
class SBI extends Bank {
    int getInterest()
    {
        return 7;
    }
}
class HDFC extends Bank {
    int getInterest()
    {
        return  8;
    }
}
public class ReserveBank {
    public static void main(String[] args) {
        Bank b = new SBI();
        Bank b2 = new HDFC();
        System.out.println(b.getInterest());
        System.out.println(b2.getInterest());
    }
}
