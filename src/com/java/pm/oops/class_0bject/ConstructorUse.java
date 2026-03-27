package com.java.pm.oops.class_0bject;
class ConstructorUse {

        String name;
        int age;

        // Constructor
        ConstructorUse(String n, int a) {
            name = n;
            age = a;
        }

        public static void main(String[] args) {
            // Object creation with constructor
            ConstructorUse obj1 = new ConstructorUse("Rahul", 20);
            ConstructorUse obj2 = new ConstructorUse("Anita", 22);

            obj1.display();
            obj2.display();
        }

        // Method to display details
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

