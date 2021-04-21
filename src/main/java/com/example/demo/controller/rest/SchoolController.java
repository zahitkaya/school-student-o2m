package com.example.demo.controller.rest;

import com.example.demo.model.School;
import com.example.demo.service.impl.SchoolServiceImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/school/v1")
public class SchoolController {

    final SchoolServiceImpl schoolServiceImpl;

    @GetMapping
    public List<School> getAllSchools(){
        return schoolServiceImpl.findAllSchools();
    }

    @PostMapping
    public School addSchool(@RequestBody School school){
        return schoolServiceImpl.addSchool(school);
    }

    @PutMapping("/{id}")
    public School updateSchool(@PathVariable String id,@RequestBody School school){
        return schoolServiceImpl.updateSchool(id,school);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        schoolServiceImpl.deleteSchoolById(id);
    }

}
