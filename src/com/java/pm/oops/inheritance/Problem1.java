package com.java.pm.oops.inheritance;
class Problem1 {

        String description; // Problem ka description store karne ke liye variable

        // Constructor: Jab object create hota hai, problem description set ho jaye
        Problem1(String desc) {
            description = desc;
        }

        // Main method - Java program ka entry point
        public static void main(String[] args) {
            // 2 alag-alag problems ke liye objects create kiye
            Problem1 p1 = new Problem1("Add two numbers");
            Problem1 p2 = new Problem1("Reverse a string");

            // Pehli problem display aur solve karo
            p1.display();
            p1.solveMath(10, 5); // 10 + 5

            // Dusri problem display aur solve karo
            p2.display();
            p2.solveString("Hello"); // String reverse karna
        }

        // Method to display the problem description
        void display() {
            System.out.println("Problem: " + description);
        }

        // Method to solve simple math problem (addition)
        void solveMath(int a, int b) {
            int sum = a + b; // Do numbers ka sum calculate karna
            System.out.println("Solution: " + a + " + " + b + " = " + sum);
            System.out.println("----------------------"); // Visual separation
        }

        // Method to solve simple string problem (reverse the string)
        void solveString(String str) {
            String reversed = ""; // Empty string to store reversed result
            for(int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i); // Last character se first tak add karo
            }
            System.out.println("Solution: Reverse of '" + str + "' = " + reversed);
            System.out.println("----------------------");
        }
    }

