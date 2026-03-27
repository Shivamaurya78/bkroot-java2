package com.java.sm.advanced.collection.hashmap;

import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        int arr[] = {3,4,3,2,4,5,5,7,6,7,8,7,8,9};
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num) + 1);
            }
            else {
                map.put(num,1);
            }
        }
        System.out.println(map);

    }
}
