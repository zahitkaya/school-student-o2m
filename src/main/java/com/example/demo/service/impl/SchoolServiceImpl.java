package com.example.demo.service.impl;

import com.example.demo.mapper.SchoolMapper;
import com.example.demo.model.School;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.service.SchoolService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolServiceImpl implements SchoolService {

    final SchoolRepository schoolRepository;
    final SchoolMapper schoolMapper;

    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

    public School addSchool(School school){
        return schoolRepository.save(school);
    }

    public School updateSchool(String id,School school){
        var oldSchool=schoolRepository.findById(id).get();
        schoolMapper.updateSchool(school,oldSchool);
        return oldSchool;
    }

    public void deleteSchoolById(String id){
        schoolRepository.deleteById(id);
    }

}
