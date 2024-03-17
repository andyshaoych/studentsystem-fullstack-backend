package com.andycodes.studentsystem.service;

//import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andycodes.studentsystem.model.Student;
import com.andycodes.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student saveStudent(Student student) {
    // TODO Auto-generated method stub
    return studentRepository.save(student);
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}
