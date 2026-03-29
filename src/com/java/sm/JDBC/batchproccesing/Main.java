package com.java.sm.JDBC.batchproccesing;
import java.sql.*;
import java.util.Scanner;
  // by using statemetn metpd
public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb ";
    private static final String username = "root";
    private static final String password = "1144";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            while(true)
            {
                System.out.print("Enter name : ");
                String name = scanner.next();
                System.out.print("Enter age :");
                int age = scanner.nextInt();
                System.out.print("Enter marks :");
                double marks = scanner.nextDouble();
                System.out.print("Enterr the more data (Y/N) : ");
                String choice = scanner.next();
                String query = String.format("insert into students(name,age,marks)values('%s',%d,%f)",name,age,marks);
                statement.addBatch(query);
                if(choice.toUpperCase().equals("N"))
                {
                    break;
                }

            }
            int [] arr = statement.executeBatch();
            for(int i = 0; i<arr.length; i++)
            {
                if(arr[i] == 0)
                {
                    System.out.println("Query : " +i+ " is not excuted succefully");
                }
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
