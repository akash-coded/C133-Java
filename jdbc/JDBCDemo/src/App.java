import java.sql.*;
import controllers.CityController;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            CityController cities = new CityController();
            cities.create();
            cities.read(); // prints the details of all cities
            cities.readOne(); // prints the details of one city
        } catch (Exception e) {
            System.out.println("Some error occurred in the application " + e);
        }
    }
}
