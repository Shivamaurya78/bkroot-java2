package com.java.sm.JDBC;

public class Mainn {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver found ✅");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NOT found ❌");
        }
    }
}
