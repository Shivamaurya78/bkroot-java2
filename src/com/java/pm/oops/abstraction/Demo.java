package com.java.abstraction;
class Demo {
        public static void main(String[] args) {
            System.out.println("Hello, this is Demo class!");

            // Example variable
            int number = 10;
            System.out.println("Number: " + number);

            // Example method call
            greet();
        }

        // Simple method inside same class
        static void greet() {
            System.out.println("Welcome to Demo class!");
        }
    }

