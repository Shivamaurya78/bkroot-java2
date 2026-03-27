package com.java.sm.advanced.collection.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("MySql");
        list.add("Rest API");

        System.out.println(list);

        list.remove("MySql");
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
