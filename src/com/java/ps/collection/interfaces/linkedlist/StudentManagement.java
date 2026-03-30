package com.java.ps.collection.interfaces.linkedlist;
import java.util.*;
class Student{
    int id;
    String name;
    //constructor
    Student(int id, String name){
    }
    void display(){
        System.out.println("id " + id + "Name" + name);
    }
}
public class Studentmanagment {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add(new Student (1 ,"ram"));
         list.add(new Student(2, "rahul"));
    }
}
