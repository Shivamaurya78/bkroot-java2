package com.java.sm.basics.array;

public class sum {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

