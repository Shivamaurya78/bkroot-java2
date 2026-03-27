package com.java.ps.exception;

public class ATMExample {

    // Method jisme hum check kar rahe hai balance
    // "throws" use kiya hai kyuki ye method exception throw kar sakta hai
    static void withdraw(int balance, int amount) throws Exception {

        // Agar balance kam hai
        if (balance < amount) {

            // "throw" use karke manually exception throw kar rahe hai
            throw new Exception("Insufficient Balance");
        }

        // Agar sab sahi hai to withdraw ho jayega
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        // Assume initial balance
        int balance = 5000;

        try {
            // Withdraw method call
            withdraw(balance, 7000);  // jyada amount dal diya intentionally

        } catch (Exception e) {
            // Yaha exception handle ho raha hai
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Ye block hamesha chalega (chahe error aaye ya na aaye)
            System.out.println("Thank you for using ATM");
        }
    }
}
