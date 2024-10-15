package CRUD_Aplication.spring_rest_demo.Entities.Exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }

}
