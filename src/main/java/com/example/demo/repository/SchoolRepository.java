package com.example.demo.repository;

import com.example.demo.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,String> {
}
