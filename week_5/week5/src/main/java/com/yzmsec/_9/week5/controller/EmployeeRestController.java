package com.yzmsec._9.week5.controller;

import com.yzmsec._9.week5.Model.entities.Employee;
import com.yzmsec._9.week5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            throw new RuntimeException("Employee not found for the id: " + id);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee savedEmployee = employeeService.save(employee);
        return savedEmployee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        Employee employee= employeeService.getEmployeeById(id);
        if (employee == null) {
            throw new RuntimeException("Employee not found for the id: " + id);
        }
        employeeService.deleteEmployeeById(id);
        return "Employee deleted with id: " + id;
    }
}
