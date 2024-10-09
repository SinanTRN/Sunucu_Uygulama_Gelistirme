package com.crud.CRUD_Aplication;

import com.crud.CRUD_Aplication.DAO.StudentDAO;
import com.crud.CRUD_Aplication.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAplicationApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudAplicationApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//findStudentById(studentDAO);
			//findAllStudents(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
		};
	}
	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object");
		Student student = new Student("John", "Doe", "johnDoe@luv2.com");

		System.out.println("Saving student object");
		studentDAO.save(student);

		System.out.println("Student saved genareted id: " + student.getId());
	}

	private void findStudentById(StudentDAO studentDAO) {
		System.out.println("Finding student by id");
		Student student = studentDAO.findById(1);
		System.out.println("Student found: " + student);
	}
	private void findAllStudents(StudentDAO studentDAO) {
		System.out.println("Finding all students");
		studentDAO.findAll().forEach(System.out::println);
	}
	private void updateStudent(StudentDAO studentDAO) {
		System.out.println("Updating student");
		Student student = studentDAO.findById(1);
		student.setName("Jane");
		studentDAO.update(student);
		System.out.println("Student updated: " + studentDAO.findById(1));
	}
	private void deleteStudent(StudentDAO studentDAO) {
		System.out.println("Deleting student");
		studentDAO.delete(2);
		System.out.println("Student deleted");
	}
}
