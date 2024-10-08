package com.andycodes.studentsystem.controller;

//import org.hibernate.mapping.List;   // not works  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.andycodes.studentsystem.model.Student;
import com.andycodes.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin

public class StudentController {
  @Autowired
  private StudentService studentService;

  @PostMapping("/add")
  public String add(@RequestBody Student student) {
    studentService.saveStudent(student);
    return "New student is added.";
  }

  @GetMapping("/getAll")
  public List<Student> getAll() {
    return studentService.getAllStudents();
  }

  @DeleteMapping("/deleteByEntity")
  public String deleteByEntity(@RequestBody Student student) {
    studentService.deleteByEntity(student);
    return "The student is deleted.";
  }

}
