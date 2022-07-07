package com.example.sushant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sushant.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel ,String>{

}
