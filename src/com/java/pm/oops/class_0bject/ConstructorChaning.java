package com.java.pm.oops.class_0bject;
class ConstructorChaining {

        int a, b;

        // Default constructor
        ConstructorChaining() {
            this(10); // calls single parameter constructor
            System.out.println("Default Constructor");
        }

        // One parameter constructor
        ConstructorChaining(int a) {
            this(a, 20); // calls two parameter constructor
            System.out.println("One Parameter Constructor");
        }

        // Two parameter constructor
        ConstructorChaining(int a, int b) {
            this.a = a;
            this.b = b;
            System.out.println("Two Parameter Constructor");
            System.out.println("Values: a = " + a + ", b = " + b);
        }

        public static void main(String[] args) {
            ConstructorChaining obj = new ConstructorChaining();
        }
    }

