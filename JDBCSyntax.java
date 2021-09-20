import java.sql.*;

public class JDBCSyntax {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        String url = "jdbc:h2:~/test";
        String user = "root";
        String password = "";

        // Properties properties = new Properties();
        // properties.put("user", "root");
        // properties.put("password", "");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            connection.setAutoCommit(false);
            try (Statement statement = connection.createStatement()) {
                String sql = "SELECT * FROM Worker WHERE WORKER_ID = 3";
                ResultSet result = statement.executeQuery(sql);
                while (result.next()) {
                    int id = result.getInt("WORKER_ID");
                    String firstName = result.getString("FIRST_NAME");
                }

                sql = "SELECT * FROM Worker WHERE WORKER_ID = 2";
                ResultSet result2 = statement.executeQuery(sql);
                while (result2.next()) {
                    int id = result.getInt("WORKER_ID");
                    String firstName = result.getString("FIRST_NAME");
                }

                String updateSql = "UPDATE Worker SET FIRST_NAME = 'John' WHERE WORKER_ID = 3";
                int rowsAffected = statement.executeUpdate(updateSql);

                String updateSql2 = "UPDATE Worker SET FIRST_NAME = 'Paul' WHERE WORKER_ID = 4";
                int rowsAffected2 = statement.executeUpdate(updateSql2);

                String updateSql3 = "UPDATE Worker SET FIRST_NAME = 'Jacob' WHERE WORKER_ID = 5";
                int rowsAffected3 = statement.executeUpdate(updateSql3);

                // Batch Update
                statement.addBatch(updateSql);
                statement.addBatch(updateSql2);
                statement.addBatch(updateSql3);

                int[] recordsAffected = statement.executeBatch();

                String deleteSql = "DELETE FROM WHERE WORKER_ID = 3";
                rowsAffected = statement.executeUpdate(updateSql);
            }

            String sqlForPrepStat = "SELECT * FROM Worker WHERE WORKER_ID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlForPrepStat)) {
                preparedStatement.setInt(1, 3);
                preparedStatement.executeQuery();

                preparedStatement.setInt(1, 2);
                preparedStatement.executeQuery();
            }

            String sqlForUpdatePrepStat = "UPDATE Worker SET FIRST_NAME = ? WHERE WORKER_ID = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlForUpdatePrepStat)) {
                preparedStatement.setString(1, "John");
                preparedStatement.setInt(2, 3);
                preparedStatement.addBatch();
                // int affectedRows1 = preparedStatement.executeUpdate();

                preparedStatement.setString(1, "Paul");
                preparedStatement.setInt(2, 4);
                preparedStatement.addBatch();
                // int affectedRows2 = preparedStatement.executeUpdate();

                preparedStatement.setString(1, "Jacob");
                preparedStatement.setInt(2, 5);
                preparedStatement.addBatch();
                // int affectedRows3 = preparedStatement.executeUpdate();

                for (int i = 3; i <= 5; i++) {
                    preparedStatement.setString(1, "John");
                    preparedStatement.setInt(2, i);
                    preparedStatement.addBatch();
                }

                int[] recordsAffected = preparedStatement.executeBatch();
            }
        } catch (SQLException e) {

        }
    }
}
