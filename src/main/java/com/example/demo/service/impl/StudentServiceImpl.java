package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;
    final SchoolRepository schoolRepository;
    final StudentMapper studentMapper;


    public List<Student> findAllStudentsBySchoolId(String id){
        return studentRepository.findAllBySchoolId(id);
    }

    public Student addStudent(String schoolId,Student student){
        var school=schoolRepository.findById(schoolId).get();
        student.setSchool(school);
        return studentRepository.save(student);
    }

    public Student updateStudent(String studentId,Student student){
        var oldStudent=studentRepository.findById(studentId).get();
        studentMapper.updateSchool(student,oldStudent);
        return oldStudent;
    }

    public void deleteStudentById(String id){
        studentRepository.deleteById(id);
    }

}