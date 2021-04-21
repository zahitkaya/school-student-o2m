package com.example.demo.controller.rest;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/student/v1")
public class StudentController {

    final StudentService studentService;

    @GetMapping("/{id}")
    public List<Student> getAllStudents(@PathVariable String id){
        return studentService.findAllStudentsBySchoolId(id);
    }

    @PostMapping("/{id}")
    public Student addStudent(@PathVariable String id,@RequestBody Student student){
        return studentService.addStudent(id,student);
    }

    @PutMapping("/{id}")
    public Student updateStudentById(String id,@PathVariable Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudentById(id);
    }



}
