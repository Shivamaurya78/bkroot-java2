package com.java.pm.oops.class_0bject;
class Demo {

        int number = 10;

        // Constructor
        Demo() {
            System.out.println("Demo Constructor Called");
        }

        public static void main(String[] args) {
            Demo d = new Demo();

            d.show();
            d.square();
        }

        // Method to display number
        void show() {
            System.out.println("Number: " + number);
        }

        // Method to calculate square
        void square() {
            int result = number * number;
            System.out.println("Square: " + result);
        }
    }

