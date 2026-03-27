package com.java.pm.oops.encapsulation;
class Main {

        String info;

        // Constructor
        Main(String i) {
            info = i;
        }

        public static void main(String[] args) {
            // Object creation
            Main m = new Main("This is the Main class example");

            m.display();
            m.greet();
        }

        // Method to display info
        void display() {
            System.out.println("Info: " + info);
        }

        // Method to greet
        void greet() {
            System.out.println("Hello from Main class!");
        }
    }

