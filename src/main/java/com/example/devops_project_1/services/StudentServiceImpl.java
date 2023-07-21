package com.example.devops_project_1.services;

import com.example.devops_project_1.entity.Student;
import com.example.devops_project_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student fetchStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
}
