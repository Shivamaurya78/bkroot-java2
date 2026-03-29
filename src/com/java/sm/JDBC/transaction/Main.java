package com.java.sm.JDBC.transaction;
import java.sql.*;
import java.util.Scanner;
// by using prepared method
public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/lenden ";
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
            connection.setAutoCommit(false);
            String debit_query = "update accounts set balance = balance - ? where account_number = ?";
            String credit_query = "update accounts set balance = balance + ? where account_number = ?";
            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter account number :");
            int account_number = scanner.nextInt();
            System.out.println("Enter amount ");
            double amount = scanner.nextDouble();

            debitPreparedStatement.setDouble(1,amount);
            debitPreparedStatement.setInt(2,account_number);
            creditPreparedStatement.setDouble(1,amount);
            creditPreparedStatement.setDouble(2,102);

             debitPreparedStatement.executeUpdate();
          creditPreparedStatement.executeUpdate();

            if(isSufficient(connection,account_number,amount))
            {
               connection.commit();
                System.out.println("Transaction successfully.. ");
            }
            else {
                connection.rollback();
                System.out.println("transcation falsed !!!");
            }
//                  debitPreparedStatement.executeUpdate();
//                 creditPreparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    static boolean isSufficient (Connection connection , int account_number, double amount)
    {
        try{
            String query = "select balance from accounts where accound_numberr = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                double current_balance = resultSet.getDouble("balance");
                if(amount> current_balance)
                {
                    return false;
                }
                else {
                    return true;
                }
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
