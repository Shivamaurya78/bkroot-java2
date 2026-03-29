package com.java.ps.collection.interfaces.listinterface;
import java.util.*;
public class Listt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ram");
        list.add("kanha");
        list.add("Shyam");
        list.add("Ram"); // duplicate allowed

        System.out.println(list);
    }
}