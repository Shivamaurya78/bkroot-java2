package com.java.pm.oops.encapsulation;
class Support {

        String message;

        // Constructor
        Support(String msg) {
            message = msg;
        }

        public static void main(String[] args) {
            Support s = new Support("System Support Active");

            s.showMessage();
            s.help();
        }

        // Method to display message
        void showMessage() {
            System.out.println("Message: " + message);
        }

        // Method to simulate support/help
        void help() {
            System.out.println("Support is providing help...");
            System.out.println("Issue resolved successfully!");
        }
    }

