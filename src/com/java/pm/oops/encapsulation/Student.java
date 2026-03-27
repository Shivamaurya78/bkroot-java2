package com.java.pm.oops.encapsulation;
class Student {

        String name;
        int rollNo;
        double marks;

        // Constructor to set student details
        Student(String n, int r, double m) {
            name = n;
            rollNo = r;
            marks = m;
        }

        public static void main(String[] args) {
            // Student objects
            Student s1 = new Student("Rahul", 101, 85);
            Student s2 = new Student("Anita", 102, 92);

            // Display details
            s1.display();
            s2.display();
        }

        // Method to show student info
        void display() {
            System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
        }
    }

