package ir.hajitsu.adapter.hr.model;

import ir.hajitsu.adapter.hr.dao.EmployeeDAO;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDTOAdapterTest {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.save(new Employee());
        employeeDAO.save(new EmployeeDTOAdapter(new EmployeeDTO()));
    }
}