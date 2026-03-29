package com.java.sm.JDBC.crud;

import java.sql.*;

// Prepared method
public class Insert{
    private static  final String url = "jdbc:mysql://127.0.0.1:3306/mydb ";
    private static final String username = "root";
    private static final String password = "1144";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
//             use for insert data
          String query = "insert into students(name,age,marks) values (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Motu");
            preparedStatement.setInt(2,19);
            preparedStatement.setDouble(3,56.4);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected>0)
            {
                System.out.println("Data is inserted");
            }
            else {
                System.out.println("Data not inserted");
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
