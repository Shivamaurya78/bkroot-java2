package com.java.pm.exception;
class Concept {

        String description; // Operation ya concept ka description store karne ke liye variable

        // Constructor: object create hote hi description set ho jaye
        Concept(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // 2 alag-alag concepts ke liye objects create kar rahe hain
            Concept c1 = new Concept("Add two numbers");
            Concept c2 = new Concept("Find length of a string");

            // Pehla concept display aur solve karo
            c1.display();
            c1.addNumbers(12, 8); // 12 + 8

            // Dusra concept display aur solve karo
            c2.display();
            c2.stringLength("Hello World"); // string ka length find karna
        }

        // Method to display the description of concept
        void display() {
            System.out.println("Concept: " + description);
        }

        // Method to perform addition of two numbers
        void addNumbers(int a, int b) {
            int sum = a + b; // Sum calculate karna
            System.out.println("Solution: " + a + " + " + b + " = " + sum);
            System.out.println("----------------------");
        }

        // Method to find length of a string
        void stringLength(String str) {
            int length = str.length(); // String ka length calculate karna
            System.out.println("Solution: Length of '" + str + "' = " + length);
            System.out.println("----------------------");
        }
    }

