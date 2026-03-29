package com.java.sm.JDBC.crud;

import java.sql.*;

// Prepared method
public class Update {
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
            // updatae dataa
            String query = "update students set marks = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, 67.4);
            preparedStatement.setInt(2, 3);

            int rowsffected = preparedStatement.executeUpdate();

            if (rowsffected > 0) {
                System.out.println("Date is succefuly ");
            } else {
                System.out.println("Data is not succefully added");
            }
        }
              catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
