package com.example.demo.service;

import com.example.demo.model.School;

import java.util.List;

public interface SchoolService {

    List<School> findAllSchools();
    School addSchool(School school);
    School updateSchool(String id,School school);
    void deleteSchoolById(String id);

}
