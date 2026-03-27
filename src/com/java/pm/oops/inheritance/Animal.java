package com.java.pm.oops.inheritance;
class Animal {

        String name;
        String type;

        // Constructor to initialize animal details
        Animal(String n, String t) {
            name = n;
            type = t;
        }

        public static void main(String[] args) {
            // Creating animal objects
            Animal a1 = new Animal("Lion", "Wild");
            Animal a2 = new Animal("Dog", "Domestic");

            // Display details and sound
            a1.display();
            a1.makeSound();

            a2.display();
            a2.makeSound();
        }

        // Method to display animal details
        void display() {
            System.out.println("Animal Name: " + name);
            System.out.println("Animal Type: " + type);
        }

        // Method to simulate animal sound
        void makeSound() {
            if(name.equalsIgnoreCase("Lion")) {
                System.out.println(name + " roars!");
            } else if(name.equalsIgnoreCase("Dog")) {
                System.out.println(name + " barks!");
            } else {
                System.out.println(name + " makes a sound!");
            }
            System.out.println("----------------------");
        }
    }

