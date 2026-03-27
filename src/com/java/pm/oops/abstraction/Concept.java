package com.java.pm.oops.abstraction;
class Concept {

    int number = 5;

    public static void main(String[] args) {
        Concept obj = new Concept();

        obj.showNumber();
        obj.checkEvenOdd();
        obj.printLoop();
    }

    // Method to display number
    void showNumber() {
        System.out.println("Number: " + number);
    }

    // Method to check even or odd
    void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // Method using loop
    void printLoop() {
        System.out.println("Printing numbers from 1 to " + number);
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

}


