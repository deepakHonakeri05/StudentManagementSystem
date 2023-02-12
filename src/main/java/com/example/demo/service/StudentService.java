package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student saveStudent(Student student);

    public Student getStudentById(Long id);
    public Student updateStudent(Student student);

    public void deleteStudentById(Long id);
}
