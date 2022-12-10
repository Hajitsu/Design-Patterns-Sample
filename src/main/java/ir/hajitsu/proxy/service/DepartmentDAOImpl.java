package ir.hajitsu.proxy.service;

import java.sql.*;

public class DepartmentDAOImpl implements DepartmentDAO {
    private final DBConnection dbConnection;

    public DepartmentDAOImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public DBConnection getDBConnection() {
        return dbConnection;
    }

    @Override
    public void insertNewDepartment(int depId, String depName) throws SQLException {
        Connection connection = dbConnection.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO DEPARTMENTS VALUES (?, ?)")) {
            preparedStatement.setInt(1, depId);
            preparedStatement.setString(2, depName);
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public String queryDepartmentName(int depId) throws SQLException {
        Connection connection = dbConnection.getConnection();
        String result = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT DEPARTMENT_NAME FROM DEPARTMENTS WHERE DEPARTMENT_ID=?")) {
            preparedStatement.setInt(1, depId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    result = resultSet.getString(1);
                }
            }
            return result;
        }
    }
}
