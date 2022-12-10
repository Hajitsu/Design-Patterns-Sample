package ir.hajitsu.proxy.service;

import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    private Connection connection;

    public DBConnection() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            LOGGER.severe(e.getMessage());
            throw new IllegalStateException("Please load database driver", e);
        }
    }

    public Connection openConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FALSE", "sa", "");
        connection.setAutoCommit(false);
        LOGGER.info("Connection established successfully");
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS DEPARTMENTS (DEPARTMENT_ID INTEGER NOT NULL, DEPARTMENT_NAME NVARCHAR(255), PRIMARY KEY(DEPARTMENT_ID))");
        }
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            LOGGER.info("Connection closed.");
        }
    }
}
