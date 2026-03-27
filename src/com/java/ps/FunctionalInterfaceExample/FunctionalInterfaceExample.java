package com.java.ps.FunctionalInterfaceExample;
@FunctionalInterface
interface MyInterface{
    void show();
        }
public class FunctionalInterfaceExample {
     public static void main(String[] args) {
         //Lambda expression
MyInterface obj = ()->{
    System.out.println("hello using lamda");
};

obj.show();
    }
}
