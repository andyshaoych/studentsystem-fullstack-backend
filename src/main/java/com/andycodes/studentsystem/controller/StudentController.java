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

  @GetMapping("/getAll")
  public List<Student> list() {
    return studentService.getAllStudents();
  }

  @PostMapping("/addStudent")
  public String add(@RequestBody Student student) {
    studentService.saveStudent(student);
    return "New student is added.";
  }

}
