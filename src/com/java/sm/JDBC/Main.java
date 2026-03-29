package com.java.sm.JDBC;
import java.sql.*;
public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb ";
    private static final String username = "root";
    private static final String password = "1144";
    public static void main(String[] args) {
        try
        {
           Class.forName("com.mysl.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            // used for get data
//            String query = "select *from students";   used for get data
//            ResultSet resultSet = statement.executeQuery(query);    used for get data
//             while (resultSet.next())
//            {
//                int id  = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//
//                System.out.println("Id : "+id);
//                System.out.println("Name :"+name);
//                System.out.println("Age : "+ age);
//                System.out.println("Marks :"+marks);
//            }

            // inesrt the data in tables
//            String query = String.format("insert into students (name,age,marks) values ('%s', %o, %f)", "Pintu",25,58.3);
//            int rowsAffected  = statement.executeUpdate(query);
//            if(rowsAffected > 0 )
//            {
//                System.out.println("Data is successfully added ...");
//            }
//            else {
//                System.out.println("Data not insert ");
//            }

            // Updata the data
//            String query = String.format("update students set marks = %f where id = %d", 95.8, 1);
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0)
//            {
//                System.out.println("Date is succefully updated ");
//            }
//            else {
//                System.out.println("Data is not updated ");
//            }

            // Delete query data
            String query = "delete from students where id = 2";
            int rowsAffected = statement.executeUpdate(query);
            if(rowsAffected > 0)
            {
                System.out.println("Delete succeffuslly  ");
            }
            else {
                System.out.println("not Delete ");
            }

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
