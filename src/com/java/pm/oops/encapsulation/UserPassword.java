package com.java.pm.oops.encapsulation;
class UserPassword {

        String username;
        String password;

        // Constructor to set username and password
        UserPassword(String user, String pass) {
            username = user;
            password = pass;
        }

        public static void main(String[] args) {
            // Creating a user object
            UserPassword user1 = new UserPassword("Rahul", "abc123");

            // Display user details
            user1.display();

            // Check login with correct credentials
            user1.login("Rahul", "abc123");

            // Check login with wrong credentials
            user1.login("Rahul", "wrongpass");
        }

        // Method to display username
        void display() {
            System.out.println("Username: " + username);
            System.out.println("----------------------");
        }

        // Method to check login credentials
        void login(String user, String pass) {
            if(username.equals(user) && password.equals(pass)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed! Incorrect username or password.");
            }
            System.out.println("----------------------");
        }
    }

