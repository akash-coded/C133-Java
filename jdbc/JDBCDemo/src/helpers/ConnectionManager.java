package helpers;

import java.sql.*;

public class ConnectionManager {
    private static final String url = "jdbc:mysql://localhost:3307/world";
    private static final String user = "root";
    private static final String password = "password";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to database server " + connection.getMetaData().getDatabaseProductName()
                        + " version: " + connection.getMetaData().getDatabaseProductVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
