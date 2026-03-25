package com.java.sm.basics.method;

import java.util.Scanner;

public class MathUtillity {
    public int GetFactorial(int n)
    {
        int fact = 1;
        for(int i = 1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public  static  boolean GetPrime(int n)
    {
        if(n<=1) return false;
        for(int i = 2; i<Math.sqrt(n); i++)
        {
            if(n % i == 0) return  false;
        }
        return true;

    }

   public  int GetFibbonaci(int n )
   {
       int a = 0, b= 1, sum = 0;
       if(n == 1) return a;
       if(n == 2) return  b;
       for(int i = 3; i<=n; i++)
       {
           sum = a+b;
           a = b;
           b = sum;
       }
       return  sum;

   }

   public  int GetTribbonaci(int n)
   {
       int a=0,b=0,c=1, sum = 0;
       if(n == 0) return a;
       if(n == 1) return b;
       if(n==2) return c;
       for(int i = 3; i<=n; i++)
       {
           sum = a+b+c;
           a=b;
           b= c;
           c = sum;
       }
       return sum;
   }
    public static void main(String[] args) {
        System.out.println("All Maths Program.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        MathUtillity f = new MathUtillity();
        f.GetFactorial(n);
        System.out.println("Fatorail is "+f.GetFactorial(n));
        f.GetPrime(n);
        System.out.println(n+(f.GetPrime(n) ? " Prime " : " is not prime "));
        f.GetFibbonaci(n);
        System.out.println("Fibboanci number is " +f.GetFibbonaci(n));
        f.GetTribbonaci(n);
        System.out.println("tribboanci number is "+f.GetTribbonaci(n));



    }
}
