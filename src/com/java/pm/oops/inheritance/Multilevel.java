package com.java.pm.oops.inheritance;
class Multilevel {

        String name;

        // Constructor
        Multilevel(String n) {
            name = n;
        }

        public static void main(String[] args) {
            // Simulating multilevel: Grandparent -> Parent -> Child
            Multilevel grandparent = new Multilevel("Grandparent");
            Multilevel parent = new Multilevel("Parent");
            Multilevel child = new Multilevel("Child");

            // Display the multilevel relationship
            grandparent.display("Grandparent");
            parent.display("Parent of " + grandparent.name);
            child.display("Child of " + parent.name);
        }

        // Method to display hierarchy
        void display(String relation) {
            System.out.println(relation + ": " + name);
            System.out.println("----------------------");
        }
    }

