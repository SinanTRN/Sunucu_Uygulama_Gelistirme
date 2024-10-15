package com.crud.CRUD_Aplication.DAO;

import com.crud.CRUD_Aplication.entity.Student;

import java.util.List;

public interface StudentDAO {
     void save(Student theStudent);
     Student findById(int id);
     List<Student> findAll();
     void update(Student theStudent);
     void delete(int id);

}
