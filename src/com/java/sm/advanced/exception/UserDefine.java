package com.java.sm.advanced.exception;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class test
{
    void checkAge(int age) throws InvalidAgeException {
        if(age < 18)
        {
            throw new InvalidAgeException(("Age must be 18+"));
        }
        else {
            System.out.println("Eligible");
        }
    }
}
public class UserDefine {
    public static void main(String[] args) {
        test t = new test();

        try{
            t.checkAge(19);
        }
        catch (InvalidAgeException e )
        {
            System.out.println(e.getMessage());
        }

    }
}
