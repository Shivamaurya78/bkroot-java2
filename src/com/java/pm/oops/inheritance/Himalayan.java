package com.java.pm.oops.inheritance;
class Himalayan {

        String mountainName;
        double height; // in meters

        // Constructor to initialize mountain details
        Himalayan(String name, double h) {
            mountainName = name;
            height = h;
        }

        public static void main(String[] args) {
            // Creating Himalayan mountain objects
            Himalayan m1 = new Himalayan("Mount Everest", 8848);
            Himalayan m2 = new Himalayan("Kangchenjunga", 8586);

            // Display details and simulate climb
            m1.display();
            m1.climb();

            m2.display();
            m2.climb();
        }

        // Method to display mountain details
        void display() {
            System.out.println("Mountain Name: " + mountainName);
            System.out.println("Height: " + height + " meters");
        }

        // Method to simulate climbing
        void climb() {
            System.out.println("Climbing " + mountainName + "...");
            System.out.println("Reached the top of " + mountainName + "!");
            System.out.println("----------------------");
        }
    }


