package jdbc;

import java.sql.*;

public class CreateConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://192.168.29.143:3306/jdbcbase";
            String user = "java";
            String password = "password";

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected to database server " + connection.getMetaData().getDatabaseProductName());
            } catch (SQLException e) {
                System.out.println("Error connecting to database " + url);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find driver " + e);
        }
    }
}
