package com.java.ps.collection;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        //HashSet create kiya (unique values ke liye)
        HashSet<String> set = new HashSet<>();
        //elements add kiye
        set.add("pavan");
        set.add("shiva");
        set.add("pavan"); // duplicate → ignore ho jayega

        System.out.println(set);
    }
    }


