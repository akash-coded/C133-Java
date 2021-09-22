import java.sql.*;
import controllers.CityController;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            CityController cities = new CityController();
            cities.index();
        } catch (Exception e) {
            System.out.println("Some error occurred in the application " + e);
        }
    }
}
