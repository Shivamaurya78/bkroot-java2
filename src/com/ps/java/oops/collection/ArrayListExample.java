package com.ps.java.oops.collection;
import java.util.ArrayList;
public class ArrayListExample {
     public static void main(String[] args) {
         //Array list create kiya
        ArrayList<String>list = new ArrayList<>();
        //element add kiya
        list.add("ram");
        list.add("syam");
        list.add("kam");
        list.add("dam");

         System.out.println(list);
         //index se element access kiya
         System.out.println(list.get(1));
    }


}
