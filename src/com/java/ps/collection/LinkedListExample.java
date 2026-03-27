package com.java.ps.collection;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String args[]) {
        // LinkedList create kiya
        LinkedList<String>list = new LinkedList();
        // element add kiya
        list.add("pavan");
        list.add("shiva");
        list.add("pritam");
        //first or last me add karo
        list.addFirst("statr");
        list.addLast("end");
        System.out.println(list);

    }
}
