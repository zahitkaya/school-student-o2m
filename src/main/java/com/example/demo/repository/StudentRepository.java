package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {

    List<Student> findAllBySchoolId(String id);
    Student findByIdAndSchoolId(String id,String schoolId);

}
