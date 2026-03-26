package com.ps.java.oops.exception;

// Ye hamari khud ki exception class hai
class UnderAgeException extends Exception {

    // Constructor
    UnderAgeException(String message) {
        super(message);  // parent class (Exception) ko message bhej rahe hai
    }
}
public class UserDefineException {

    static void checkAge(int age) throws UnderAgeException {

        if(age < 18){
            // apni custom exception throw kar rahe hai
            throw new UnderAgeException("You are not eligible");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);  // intentionally galat input
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
