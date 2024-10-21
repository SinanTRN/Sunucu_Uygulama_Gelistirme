package com.yzmsec._9.week5.Service;

import com.yzmsec._9.week5.Model.entities.Employee;
import com.yzmsec._9.week5.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployeeById(int id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
