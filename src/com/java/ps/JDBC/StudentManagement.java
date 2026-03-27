package com.java.ps.JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) throws Exception {

        // 👉 Scanner user input lene ke liye
        Scanner sc = new Scanner(System.in);

        // 👉 Database connection create kar rahe hain
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", // DB URL
                "root",   // username
                "password" // password
        );

        // 👉 Menu loop (bar-bar options dikhane ke liye)
        while (true) {

            // 👉 User ko options dikha rahe hain
            System.out.println("\n1. Insert Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            // 👉 Option 1: Insert
            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                // 👉 SQL query insert ke liye
                String query = "INSERT INTO student VALUES (?, ?)";

                // 👉 PreparedStatement (safe + dynamic values)
                PreparedStatement ps = con.prepareStatement(query);

                // 👉 ? ki jagah values set kar rahe hain
                ps.setInt(1, id);
                ps.setString(2, name);

                // 👉 query execute
                ps.executeUpdate();

                System.out.println("Student Inserted");

            }

            // 👉 Option 2: View (Read)
            else if (choice == 2) {

                String query = "SELECT * FROM student";

                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery(query);

                // 👉 data print kar rahe hain
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " " + rs.getString("name"));
                }
            }

            // 👉 Option 3: Update
            else if (choice == 3) {

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                System.out.print("Enter new Name: ");
                String name = sc.next();

                String query = "UPDATE student SET name=? WHERE id=?";

                PreparedStatement ps = con.prepareStatement(query);

                // 👉 values set kar rahe hain
                ps.setString(1, name);
                ps.setInt(2, id);

                ps.executeUpdate();

                System.out.println("Student Updated");
            }

            // 👉 Option 4: Exit
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        // 👉 connection close
        con.close();
    }
}
