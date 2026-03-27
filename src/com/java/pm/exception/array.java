package com.java.pm.exception;
class Array {

        String description; // Concept ya operation ka description store karne ke liye variable

        // Constructor: object create hote hi description set ho jaye
        Array(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // 2 alag-alag array operations ke liye objects create kar rahe hain
            Array a1 = new Array("Sum and Average of numbers in an array");
            Array a2 = new Array("Find length of each string in an array");

            // Pehla array operation display aur solve karo
            a1.display();
            int[] numbers = {5, 10, 15, 20, 25}; // Integer array
            a1.sumAndAverage(numbers); // Array ka sum aur average calculate karna

            // Dusra array operation display aur solve karo
            a2.display();
            String[] strings = {"Java", "Programming", "Array"}; // String array
            a2.stringArrayLength(strings); // Har string ka length find karna
        }

        // Method to display the description of array operation
        void display() {
            System.out.println("Operation: " + description);
        }

        // Method to calculate sum and average of numbers in an array
        void sumAndAverage(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num; // Sum calculate karna
            }
            double average = (double) sum / arr.length; // Average calculate karna

            System.out.println("Numbers in array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nSum = " + sum);
            System.out.println("Average = " + average);
            System.out.println("----------------------");
        }

        // Method to find length of each string in an array
        void stringArrayLength(String[] arr) {
            System.out.println("Strings in array: ");
            for (String s : arr) {
                System.out.println("'" + s + "' has length " + s.length());
            }
            System.out.println("----------------------");
        }
    }

