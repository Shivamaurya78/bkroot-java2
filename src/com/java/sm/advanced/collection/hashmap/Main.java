package com.java.sm.advanced.collection.hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // create a hashmap
        map.put(101,"Shiva Maurya");
        map.put(102,"Pintu");
        map.put(103,"Pakandi");

        System.out.println("Full Map : " +map);
        System.out.println("Roll 101: " +map.get(101));
        map.remove(103);
        System.out.println("After removal " +map);

        //  Traverse using loop
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
