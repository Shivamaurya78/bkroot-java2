package com.java.sm.advanced.collection.arraylist;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(15);

        ArrayList<Integer> unique = new ArrayList<>();

        for(int num : list)
        {
            if(!unique.contains(num))
            {
                unique.add(num);
            }
        }
        System.out.println("Unique number is " +unique);
    }
}
