package com.java.sm.advanced.exception;
// Retunrn value with exception..
class Test
{
  void display(int a, int b)
    {
        try{
            int result = a/b;
            System.out.println("Rsult is " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divede by " +b);
//            return -1;
        }
        finally {
            System.out.println("It is Divede Method");
        }
    }
}
