package com.java.ps.collection;
import java.util.HashMap;
public class HashMapeExample {
     public static void main(String[] args) {
         //HashMap create ki
        HashMap<String ,Integer>map = new HashMap<>();
        //key-value pair add kiye
        map.put("pavan", 200);
        map.put("shiva ",100);
        map.put("pavan",300);// same key → value update
         System.out.println(map);
         //value access using key
         System.out.println(map.get("pavan"));
    }
}
