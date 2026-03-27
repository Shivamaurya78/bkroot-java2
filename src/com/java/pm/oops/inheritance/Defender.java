package com.java.pm.oops.inheritance;
class Defender {

        String name;
        int jerseyNumber;
        String team;

        // Constructor to initialize defender details
        Defender(String n, int j, String t) {
            name = n;
            jerseyNumber = j;
            team = t;
        }

        public static void main(String[] args) {
            // Creating defender objects
            Defender d1 = new Defender("Ramos", 4, "Real Madrid");
            Defender d2 = new Defender("Van Dijk", 4, "Liverpool");

            // Display details and simulate action
            d1.display();
            d1.tackle();

            d2.display();
            d2.tackle();
        }

        // Method to display defender details
        void display() {
            System.out.println("Player Name: " + name);
            System.out.println("Jersey Number: " + jerseyNumber);
            System.out.println("Team: " + team);
        }

        // Method to simulate tackling action
        void tackle() {
            System.out.println(name + " performs a tackle!");
            System.out.println("----------------------");
        }
    }

