package com.example.sushant.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sushant.model.StudentModel;
import com.example.sushant.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	public String dlt_student(String id) {
		return "";
	}
	
	public ArrayList getAll() {
		return (ArrayList) repo.findAll();
	}
	
	public void saveStudent(StudentModel model) {
		repo.save(model);
	}

}
