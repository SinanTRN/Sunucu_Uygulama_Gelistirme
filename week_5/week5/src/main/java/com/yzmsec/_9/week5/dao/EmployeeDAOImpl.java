package com.yzmsec._9.week5.dao;

import com.yzmsec._9.week5.Model.entities.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager em;
    @Autowired
    public EmployeeDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = em.merge(employee);

        return dbEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return em.find(Employee.class, id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        em.merge(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        Employee employee = em.find(Employee.class, id);
        em.remove(employee);

    }
}
