package com.java.pm.exception;
class BugBattlers {

        String teamName; // Team ka naam store karne ke liye variable

        // Constructor: object create hote hi team ka naam set ho jaye
        BugBattlers(String name) {
            teamName = name;
        }

        public static void main(String[] args) {
            // Do team objects create kar rahe hain
            BugBattlers team1 = new BugBattlers("Alpha");
            BugBattlers team2 = new BugBattlers("Beta");

            // Team ke alag sessions me fix kiye gaye bugs ke points store kar rahe hain
            int[] alphaPoints = {5, 3, 7, 2};
            int[] betaPoints = {4, 6, 5, 3};

            // Pehla team display aur total points calculate karo
            team1.displayTeam();
            team1.totalPoints(alphaPoints);

            // Dusra team display aur total points calculate karo
            team2.displayTeam();
            team2.totalPoints(betaPoints);
        }

        // Method to display team name
        void displayTeam() {
            System.out.println("Team: " + teamName);
        }

        // Method to calculate total points (total bugs fixed)
        void totalPoints(int[] points) {
            int total = 0;
            for(int p : points) {
                total += p; // Array ke sab points ka sum
            }
            System.out.println("Total bugs fixed: " + total);
            System.out.println("----------------------");
        }
    }

