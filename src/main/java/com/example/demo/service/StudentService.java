package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudentsBySchoolId(String id);
    Student addStudent(String schoolId,Student student);
    Student updateStudent(String id,Student student);
    void deleteStudentById(String id);
}
