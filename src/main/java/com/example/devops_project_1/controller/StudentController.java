package com.example.devops_project_1.controller;

import com.example.devops_project_1.entity.Student;
import com.example.devops_project_1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{id}")
    public Student fetchStudentById(@PathVariable("id") Long id){
        return studentService.fetchStudentById(id);
    }
}
