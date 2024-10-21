package com.yzmsec._9.week5.Service;

import com.yzmsec._9.week5.Model.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void updateEmployee(Employee employee);
    public void deleteEmployeeById(int id);
}
