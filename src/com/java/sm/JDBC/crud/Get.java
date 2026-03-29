package com.java.sm.JDBC.crud;

import java.sql.*;

// Prepared method
public class Get {
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
            // get data form table
            String query = "select marks from students where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double marks = resultSet.getDouble("marks");
                System.out.println("Marks : " + marks);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
