package com.java.sm.advanced.exception;

public class age {
    void checkAge(int age)
    {
        try{
            if(age<18)
            {
                throw new ArithmeticException("Not eligible");
            }
            else{
                System.out.println("Eligible");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I give vote to BJP");
        }
    }
}
