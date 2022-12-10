package ir.hajitsu.proxy.service;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentDAOTest {
    private static DBConnection dbConnection;
    private static DepartmentDAO departmentDAO;

    @BeforeAll
    static void beforeAll() throws SQLException {
        dbConnection = new DBConnection();
        dbConnection.openConnection();
        departmentDAO = new DepartmentDAOImpl(dbConnection);

    }

    @Test
    void insertNewDepartment() throws SQLException {
        DepartmentDAO daoProxy = TransactionProxy.createTransaction(departmentDAO);
        daoProxy.insertNewDepartment(1, "dep 1");

        dbConnection.getConnection().rollback();
        Assert.assertEquals(departmentDAO.queryDepartmentName(1), "dep 1");
    }

    @Test
    void queryDepartmentName() {
    }
}