package com.java.pm.oops.inheritance;
class Vehicle {

        String type;
        String brand;
        int speed;

        // Constructor to initialize vehicle details
        Vehicle(String t, String b, int s) {
            type = t;
            brand = b;
            speed = s;
        }

        public static void main(String[] args) {
            // Creating vehicle objects
            Vehicle v1 = new Vehicle("Car", "Toyota", 120);
            Vehicle v2 = new Vehicle("Bike", "Honda", 80);

            // Display details and simulate movement
            v1.display();
            v1.move();

            v2.display();
            v2.move();
        }

        // Method to display vehicle details
        void display() {
            System.out.println("Vehicle Type: " + type);
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
        }

        // Method to simulate movement
        void move() {
            System.out.println(brand + " " + type + " is moving at " + speed + " km/h!");
            System.out.println("----------------------");
        }
    }

