package com.java.sm.advanced.collection.linkedlist;

class Node {
    int data;  // data store
    Node next;   // next data ka address store ke liye

    Node (int data)
    {
        this.data = data;  // constructor value assign
        this.next = null;  // initally next null
    }
}
public class Print {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // linking nodes
        head.next= second;
        second.next = third;
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
