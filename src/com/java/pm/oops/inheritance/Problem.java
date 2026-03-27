package com.java.pm.oops.inheritance;
class Problem {

        String description;

        // Constructor to set problem description
        Problem(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // Creating problem objects
            Problem p1 = new Problem("Add two numbers");
            Problem p2 = new Problem("Reverse a string");

            // Display problem and solve
            p1.display();
            p1.solveMath(10, 5);

            p2.display();
            p2.solveString("Hello");
        }

        // Method to display the problem
        void display() {
            System.out.println("Problem: " + description);
        }

        // Method to solve a simple math problem
        void solveMath(int a, int b) {
            int sum = a + b;
            System.out.println("Solution: " + a + " + " + b + " = " + sum);
            System.out.println("----------------------");
        }

        // Method to solve a simple string problem
        void solveString(String str) {
            String reversed = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            System.out.println("Solution: Reverse of '" + str + "' = " + reversed);
            System.out.println("----------------------");
        }
    }

