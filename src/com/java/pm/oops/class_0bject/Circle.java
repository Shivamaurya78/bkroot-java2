package com.java.pm.oops.class_0bject;
class Circle {

        double radius = 5;

        public static void main(String[] args) {
            Circle c = new Circle();

            c.displayDetails();
            c.calculateArea();
            c.calculateCircumference();
        }

        // Method to display radius
        void displayDetails() {
            System.out.println("Radius: " + radius);
        }

        // Method to calculate area
        void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        }

        // Method to calculate circumference
        void calculateCircumference() {
            double circumference = 2 * Math.PI * radius;
            System.out.println("Circumference of Circle: " + circumference);
        }
    }

