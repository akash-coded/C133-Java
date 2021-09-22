package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.City;

public class CityController {
    public void index() { // Read operation
        try {
            ResultSet result = City.fetchTenCities();
            System.out.println("Id\tName\tCountryCode\tDistrict\tPopulation");
            while (result != null && result.next()) {
                int id = result.getInt(1);
                String name = result.getString(2);
                String countryCode = result.getString(3);
                String district = result.getString(4);
                int population = result.getInt(5);
                System.out.println(id + "\t" + name + "\t" + countryCode + "\t" + district + "\t" + population);
            }
        } catch (SQLException | NullPointerException e) {
            System.out.println("Error in reading the ResultSet");
        }
    }
}
