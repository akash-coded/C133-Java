package controllers;

import java.sql.ResultSet;
import models.City;

/**
 * Controller class for operations on city table
 */
public class CityController {
    /**
     * Retrieves the details of all the cities and prints them
     */
    public void read() {
        ResultSet result = City.fetchAllCityDetails();
        City.printCityDetails(result);
    }

    /**
     * Retrieves the details of the city correspondinf to the id
     */
    public void readOne() {
        ResultSet result = City.fetchCityDetailsById(4500);
        City.printCityDetails(result);
    }

    public void create() {
        int rowsAffected = City.insertCity(4500, "Old Delhi", "IND", "Delhi", 12737);
        System.out.println(rowsAffected + " records were inserted");
    }

    // public int update() {

    // }

    // public int delete() {

    // }
}
