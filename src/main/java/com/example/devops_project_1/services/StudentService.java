package com.example.devops_project_1.services;


import com.example.devops_project_1.entity.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(Long id);
}
