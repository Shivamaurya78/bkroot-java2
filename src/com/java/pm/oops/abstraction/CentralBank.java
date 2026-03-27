package com.java.abstraction;
class CentralBank {

        // Variable (bank name and total funds)
        String bankName = "Central Bank";
        double totalFunds = 1000000;

        public static void main(String[] args) {
            CentralBank cb = new CentralBank();

            cb.displayDetails();
            cb.deposit(5000);
            cb.withdraw(2000);
        }

        // Method to display bank details
        void displayDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Total Funds: " + totalFunds);
        }

        // Method to deposit money
        void deposit(double amount) {
            totalFunds += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Funds: " + totalFunds);
        }

        // Method to withdraw money
        void withdraw(double amount) {
            if (amount <= totalFunds) {
                totalFunds -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Funds");
            }
            System.out.println("Remaining Funds: " + totalFunds);
        }
    }

