package com.java.pm.oops.class_0bject;
class BankAccount {

        String accountHolder = "Rahul";
        int accountNumber = 12345;
        double balance = 10000;

        public static void main(String[] args) {
            BankAccount acc = new BankAccount();

            acc.displayDetails();
            acc.deposit(2000);
            acc.withdraw(1500);
        }

        // Method to display account details
        void displayDetails() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        // Method to deposit money
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
        }

        // Method to withdraw money
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
            System.out.println("Remaining Balance: " + balance);
        }
    }

