package com.java.ps.collection.interfaces.setinterface;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();
        set.add("pavan");
        set.add("rahul");
        set.add("deepak");
        set.add("pavan");//duplicate ignore
        System.out.println(set);

    }
}
