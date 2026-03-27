package com.java.sm.advanced.collection.arraylist;

import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);
        li.add(54);
        li.add(99);
        li.add(87);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : li)
        {
            if(num>max)
            {
                secondMax = max;
                max = num;
            }
            else  if (num > secondMax && num != max)
            {
                secondMax = num;
            }
        }
        System.out.println("Second largest number " +secondMax);
    }
}
