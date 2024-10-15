package CRUD_Aplication.spring_rest_demo.controller;

import CRUD_Aplication.spring_rest_demo.Entities.ErrorModels.StudentErrorResponse;
import CRUD_Aplication.spring_rest_demo.Entities.Exceptions.StudentNotFoundException;
import CRUD_Aplication.spring_rest_demo.Entities.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> students;
    @PostConstruct
    public void init() {
        students = new ArrayList<>();
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
        students.add(new Student("Tom", "Doe"));
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return students.get(studentId);
    }

}
