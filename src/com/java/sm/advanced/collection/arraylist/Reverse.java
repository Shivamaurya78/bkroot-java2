package com.java.sm.advanced.collection.arraylist;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        for(int i = li.size() -1; i>=0; i--)
        {
            System.out.println("Reverse is "+li.get(i) + " ");
        }
    }
}
