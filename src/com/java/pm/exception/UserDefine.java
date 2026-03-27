package com.java.pm.exception;
class UserDefine {

        String description; // Problem ya operation ka description store karne ke liye variable

        // Constructor: object create hote hi description set ho jaye
        UserDefine(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // 2 alag operations ke liye objects create kar rahe hain
            UserDefine u1 = new UserDefine("Add two numbers");
            UserDefine u2 = new UserDefine("Convert string to uppercase");

            // Pehla operation display aur solve karo
            u1.display();
            u1.addNumbers(20, 30); // 20 + 30

            // Dusra operation display aur solve karo
            u2.display();
            u2.convertToUpper("hello world"); // string ko uppercase me convert karna
        }

        // Method to display the description of operation
        void display() {
            System.out.println("Operation: " + description);
        }

        // Method to perform addition of two numbers
        void addNumbers(int a, int b) {
            int sum = a + b;
            System.out.println("Solution: " + a + " + " + b + " = " + sum);
            System.out.println("----------------------");
        }

        // Method to convert string to uppercase
        void convertToUpper(String str) {
            String upper = str.toUpperCase();
            System.out.println("Solution: '" + str + "' in uppercase = '" + upper + "'");
            System.out.println("----------------------");
        }
    }

