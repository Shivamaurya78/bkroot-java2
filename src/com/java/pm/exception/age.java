package com.java.pm.exception;
class Age {

        String description; // Operation ka description store karne ke liye variable

        // Constructor: object create hote hi description set ho jaye
        Age(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            // Age check ka object create kar rahe hain
            Age a1 = new Age("Check age category");

            // Concept display karo
            a1.display();

            // Example ages
            int[] ages = {5, 15, 25, 70}; // Different ages
            for(int age : ages) {
                a1.checkAgeCategory(age); // Har age ka category check karna
            }
        }

        // Method to display description
        void display() {
            System.out.println("Operation: " + description);
        }

        // Method to check age category
        void checkAgeCategory(int age) {
            String category;

            if(age >= 0 && age <= 12) {
                category = "Child";
            } else if(age >= 13 && age <= 19) {
                category = "Teenager";
            } else if(age >= 20 && age <= 59) {
                category = "Adult";
            } else if(age >= 60) {
                category = "Senior";
            } else {
                category = "Invalid Age";
            }

            System.out.println("Age: " + age + " -> Category: " + category);
        }
    }

