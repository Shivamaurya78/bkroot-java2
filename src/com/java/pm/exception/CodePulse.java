package com.java.pm.exception;
class CodePulse {

        String description; // Program ka purpose store karne ke liye variable

        // Constructor: object create hote hi description set ho jaye
        CodePulse(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // Object create kar rahe hain aur description pass kar rahe hain
            CodePulse program = new CodePulse("CodePulse: Simple arithmetic operations");

            // Description display karo
            program.showDescription();

            // Example numbers
            int num1 = 50;
            int num2 = 30;

            // Addition aur subtraction calculate karo
            program.addNumbers(num1, num2);
            program.subtractNumbers(num1, num2);
        }

        // Method to display program description
        void showDescription() {
            System.out.println(description);
            System.out.println("----------------------");
        }

        // Method to add two numbers
        void addNumbers(int a, int b) {
            int sum = a + b;
            System.out.println("Addition: " + a + " + " + b + " = " + sum);
        }

        // Method to subtract two numbers
        void subtractNumbers(int a, int b) {
            int diff = a - b;
            System.out.println("Subtraction: " + a + " - " + b + " = " + diff);
        }
    }

