package com.java.pm.oops.class_0bject;
class Student {

        String name;
        int rollNo;
        double marks;

        // Constructor
        Student(String n, int r, double m) {
            name = n;
            rollNo = r;
            marks = m;
        }

        public static void main(String[] args) {
            // Creating objects
            Student s1 = new Student("Rahul", 101, 85.5);
            Student s2 = new Student("Anita", 102, 90.0);

            s1.display();
            s2.display();
        }

        // Method to display student details
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
            System.out.println("----------------------");
        }
    }

