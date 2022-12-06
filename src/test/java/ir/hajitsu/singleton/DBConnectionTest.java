package ir.hajitsu.singleton;

import ir.hajitsu.singleton.DBConnection;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.*;

public class DBConnectionTest {

    @Test
    void getInstance() {
        DBConnection dbConnection = DBConnection.getInstance();
        Connection connection = dbConnection.getConnection();

        String queryCreate = "CREATE TABLE PERSON(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(queryCreate);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }

        String queryInsert = "INSERT INTO PERSON(ID,NAME) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(queryInsert)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "hajitsu");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "unfaithful");
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }

        String querySelect = "SELECT COUNT(*) FROM PERSON";
        try (Statement query = connection.createStatement()) {
            try (ResultSet result = query.executeQuery(querySelect)) {
                if (result.next()) {
                    System.out.println("The count is: " + result.getInt(1));
                    Assertions.assertEquals(result.getInt(1), 2);
                }
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void performanceTest() {
        long start = System.currentTimeMillis();
        System.out.println(DBConnection.getInstance());
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(DBConnection.getInstance());
        System.out.println(System.currentTimeMillis() - start);
    }
}