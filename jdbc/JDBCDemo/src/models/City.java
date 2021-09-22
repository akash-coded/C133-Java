package models;

import java.sql.*;
import helpers.ConnectionManager;

public class City {
    private static final Connection connection = ConnectionManager.getConnection();

    public static void printCityDetails(ResultSet result) {
        if (result != null) {
            System.out.println("\nId\tName\tCountryCode\tDistrict\tPopulation");
            try {
                if (!result.next()) {
                    System.out.println("Empty set!");
                } else {
                    do {
                        int id = result.getInt(1);
                        String name = result.getString(2);
                        String countryCode = result.getString(3);
                        String district = result.getString(4);
                        int population = result.getInt(5);
                        System.out.println(id + "\t" + name + "\t" + countryCode + "\t" + district + "\t" + population);
                    } while (result.next());
                }
            } catch (SQLException | NullPointerException e) {
                System.out.println("Error while printing the city details: " + e);
            }
        } else {
            System.out.println("ResultSet null");
        }
    }

    public static ResultSet fetchAllCityDetails() {
        ResultSet result = null;
        String sql = "SELECT * FROM city LIMIT ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 10);
            try {
                result = preparedStatement.executeQuery();
            } catch (SQLException e) {
                System.out.println("Error in the resultset " + e);
            }
        } catch (SQLException e) {
            System.out.println("Error obtaining an instance of the statement " + e);
        }
        return result;
    }

    /**
     * Retrieves the details of one city by its id
     * 
     * @param id int
     * @return ResultSet
     */
    public static ResultSet fetchCityDetailsById(int id) {
        ResultSet result = null;
        String sql = "SELECT * FROM city WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            try {
                result = preparedStatement.executeQuery();
            } catch (SQLException e) {
                System.out.println("Error in the resultset " + e);
            }
        } catch (SQLException e) {
            System.out.println("Error obtaining an instance of the statement " + e);
        }
        return result;
    }

    public static int insertCity(int id, String name, String countryCode, String district, int population) {
        int rowsAffected = 0;
        String sql = "insert into city (Id, Name, CountryCode, District, Population) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, countryCode);
            statement.setString(4, district);
            statement.setInt(5, population);
            try {
                rowsAffected = statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Error during insertion " + e);
            }
        } catch (SQLException e) {
            System.out.println("Error obtaining an instance of the statement " + e);
        }
        return rowsAffected;
    }

}
