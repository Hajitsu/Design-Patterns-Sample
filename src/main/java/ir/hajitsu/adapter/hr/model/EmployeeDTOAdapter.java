package ir.hajitsu.adapter.hr.model;

public class EmployeeDTOAdapter extends Employee {
    private EmployeeDTO employeeDTO;

    public EmployeeDTOAdapter(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    @Override
    public String getFullName() {
        return employeeDTO.getFirstName() + " " + employeeDTO.getLastName();
    }

    @Override
    public long getId() {
        return employeeDTO.getId();
    }

    @Override
    public String getCode() {
        return employeeDTO.getCode();
    }
}
