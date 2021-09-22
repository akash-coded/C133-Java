package models;

import java.sql.*;
import helpers.ConnectionManager;

public class City {
    private static final Connection connection = ConnectionManager.getConnection();

    public static ResultSet fetchTenCities() {
        ResultSet result = null;
        String sql = "SELECT * FROM city LIMIT ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 10);
            try {
                result = preparedStatement.executeQuery();
                // System.out.println("Printed from model");
                // while (result != null && result.next()) {
                // int id = result.getInt(1);
                // String name = result.getString(2);
                // String countryCode = result.getString(3);
                // String district = result.getString(4);
                // int population = result.getInt(5);
                // System.out.println(id + "\t" + name + "\t" + countryCode + "\t" + district +
                // "\t" + population);
                // }
            } catch (SQLException e) {
                System.out.println("Error in the resultset " + e);
            }
        } catch (SQLException e) {
            System.out.println("Error obtaining an instance of the statement " + e);
        }
        return result;
    }
}
