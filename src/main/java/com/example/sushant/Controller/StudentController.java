package com.example.sushant.Controller;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sushant.model.StudentModel;
import com.example.sushant.service.StudentService;

@Controller
public class StudentController {
    @Autowired
	StudentService service;
    
    
	@GetMapping("/getAll")
	public ArrayList getAllStudent() {
		return service.getAll();
	}
	@PostMapping("/saveStudent")
	public String saveStudent(StudentModel model) {
		try {
		 service.saveStudent(model);
		 return "Student saved Succesfully..";
		}
		catch(Exception e) {
			return "Backend Problem.";
		}
	}
}
