package com.java.sm.advanced.exception;

class Testt{
    void getElement(int arr[] , int index)
    {
        try{
            System.out.println("value "+arr[index] );
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");

        }
        finally {
            System.out.println("we are develop");
        }
    }
}

