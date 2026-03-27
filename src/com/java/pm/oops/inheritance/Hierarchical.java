package com.java.pm.oops.inheritance;
class Hierarchical {

        String name;

        // Constructor
        Hierarchical(String n) {
            name = n;
        }

        public static void main(String[] args) {
            // Simulating parent and children in one class
            Hierarchical parent = new Hierarchical("Parent");
            Hierarchical child1 = new Hierarchical("Child 1");
            Hierarchical child2 = new Hierarchical("Child 2");

            // Display hierarchical structure
            parent.displayParent();
            child1.displayChild(parent.name);
            child2.displayChild(parent.name);
        }

        // Method for parent
        void displayParent() {
            System.out.println("Parent Name: " + name);
        }

        // Method for child (linked to parent)
        void displayChild(String parentName) {
            System.out.println("Child Name: " + name + " (Child of " + parentName + ")");
            System.out.println("----------------------");
        }
    }

