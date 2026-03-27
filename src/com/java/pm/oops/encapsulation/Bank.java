package com.java.pm.oops.encapsulation;
class Bank {

        String bankName = "Central Bank";
        double balance = 10000;

        public static void main(String[] args) {
            Bank b = new Bank();

            b.display();
            b.deposit(5000);
            b.withdraw(3000);
        }

        // Method to display bank details
        void display() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Balance: " + balance);
            System.out.println("----------------------");
        }

        // Method to deposit money
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
            System.out.println("----------------------");
        }

        // Method to withdraw money
        void withdraw(double amount) {
            if(amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
            System.out.println("Remaining Balance: " + balance);
            System.out.println("----------------------");
        }
    }

