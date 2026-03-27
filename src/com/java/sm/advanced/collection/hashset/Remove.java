package com.java.sm.advanced.collection.hashset;

import java.util.HashSet;

public class Remove {
    public static void main(String[] args) {
        int [] arr = {2,3,4,3,2,4,6,5,4,7,98,7,5,6};

        HashSet<Integer> set = new HashSet<>();

        // array ke elements set me add kiye
        for(int num : arr)
        {
            set.add(num);   // duplicate automatically ignore hoga
        }
        System.out.println(set);
    }
}
