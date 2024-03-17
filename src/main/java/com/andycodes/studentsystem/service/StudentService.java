package com.andycodes.studentsystem.service;

//import org.hibernate.mapping.List;
import java.util.List;
import com.andycodes.studentsystem.model.Student;

public interface StudentService {
  public Student saveStudent(Student student);

  public List<Student> getAllStudents();

}
