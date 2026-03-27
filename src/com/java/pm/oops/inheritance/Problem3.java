package com.java.pm.oops.inheritance;
class Problem3 {

        String description; // Problem ka description store karne ke liye variable

        // Constructor: object create hone par problem description set ho jaye
        Problem3(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // 2 alag problems ke liye objects create kar rahe hain
            Problem3 p1 = new Problem3("Multiply two numbers");
            Problem3 p2 = new Problem3("Check if a string is palindrome");

            // Pehli problem display aur solve karo
            p1.display();
            p1.solveMath(6, 7); // 6 * 7

            // Dusri problem display aur solve karo
            p2.display();
            p2.solveString("madam"); // palindrome check
        }

        // Method to display the problem description
        void display() {
            System.out.println("Problem: " + description);
        }

        // Method to solve a simple math problem (multiplication)
        void solveMath(int a, int b) {
            int product = a * b; // Multiplication calculate karna
            System.out.println("Solution: " + a + " * " + b + " = " + product);
            System.out.println("----------------------");
        }

        // Method to solve a simple string problem (palindrome check)
        void solveString(String str) {
            String reversed = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i); // String reverse karna
            }

            // Check if original string aur reversed string same hain
            if(str.equals(reversed)) {
                System.out.println("Solution: '" + str + "' is a palindrome.");
            } else {
                System.out.println("Solution: '" + str + "' is NOT a palindrome.");
            }
            System.out.println("----------------------");
        }
    }

