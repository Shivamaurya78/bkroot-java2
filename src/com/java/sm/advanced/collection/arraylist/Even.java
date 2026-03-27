package com.java.sm.advanced.collection.arraylist;

import java.util.ArrayList;

public class Even {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        for(int num : list)
        {
            if(num % 2 == 0)
            {
                System.out.println("Even number is " +num);
            }
        }

    }
}
