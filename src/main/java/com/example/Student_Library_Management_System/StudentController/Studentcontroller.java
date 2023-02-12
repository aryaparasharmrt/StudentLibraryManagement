package com.example.Student_Library_Management_System.StudentController;

import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
