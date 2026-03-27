package com.java.pm.exception;
class UserDefine2 {

        String description; // Operation ka description store karne ke liye variable

        // Constructor: Object create hote hi description set ho jaye
        UserDefine2(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // 2 alag-alag operations ke liye objects create kar rahe hain
            UserDefine2 u1 = new UserDefine2("Multiply two numbers");
            UserDefine2 u2 = new UserDefine2("Convert string to lowercase");

            // Pehla operation display aur solve karo
            u1.display();
            u1.multiplyNumbers(6, 7); // 6 * 7

            // Dusra operation display aur solve karo
            u2.display();
            u2.convertToLower("HELLO WORLD"); // string ko lowercase me convert karna
        }

        // Method to display the description of operation
        void display() {
            System.out.println("Operation: " + description);
        }

        // Method to perform multiplication of two numbers
        void multiplyNumbers(int a, int b) {
            int product = a * b; // Multiplication calculate karna
            System.out.println("Solution: " + a + " * " + b + " = " + product);
            System.out.println("----------------------");
        }

        // Method to convert string to lowercase
        void convertToLower(String str) {
            String lower = str.toLowerCase(); // Lowercase conversion
            System.out.println("Solution: '" + str + "' in lowercase = '" + lower + "'");
            System.out.println("----------------------");
        }
    }

