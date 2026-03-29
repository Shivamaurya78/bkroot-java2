package com.java.ps.oops.keybords.suparkeybord;
class Animal{
    void sound(){
        System.out.println("Animal is sounding");
    }
    class Dog extends Animal{
        void sound(){
            supar.sound();
            System.out.println("Dog is bark");
        }
    }
}
public class suparKeybord {
   public static void main(String[] args) {
       

    }

}
