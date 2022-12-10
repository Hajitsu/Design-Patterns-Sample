package ir.hajitsu.proxy.service;

import java.sql.SQLException;

public interface  DepartmentDAO {
    DBConnection getDBConnection();

    void insertNewDepartment(int depId, String departmentName) throws SQLException;

    String queryDepartmentName(int depId) throws SQLException;
}
