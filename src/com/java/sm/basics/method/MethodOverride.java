package com.java.sm.basics.method;;
class Animal{
    void sound()
    {
        System.out.println("Animal sound ");
    }
}
class Tiger extends Animal{
//    @Override
     void sound()
    {
        System.out.println("Tiger sound..");
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.sound();
    }
}
