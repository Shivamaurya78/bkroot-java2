package com.java.ps.collection.interfaces.arraylist;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        // List interface ka object (ArrayList class se)
        List<String>list= new ArrayList();
        //add opration
        list.add("vinod");//index 0
        list.add("santosh");//index 1
        list.add("vivek");
        list.add("dev");
        System.out.println(" orignal list" +list);
        //get opration
        System.out.println("Element at index 3" + list.get(1));
        //UPDATE OPRATION
        list.set(2,"sita");
        System.out.println("After update " + list);
        //REMOVE OPRATION
        list.remove(0);
        System.out.println("After remove" + list);
        //Loop (traversal)
        System.out.println("Looping elements");
        for(String name : list){
            System.out.println(name);









    }
}
