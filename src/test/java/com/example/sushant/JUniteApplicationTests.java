package com.example.sushant;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sushant.Controller.StudentController;
import com.example.sushant.model.StudentModel;

@SpringBootTest
class JUniteApplicationTests {

	@Autowired
	StudentController con;
	
	@Test
	public void testController() {
		con.saveStudent(new StudentModel("123","Sushant Chaudhari","Ahmednagar","BCS"));
		ArrayList list=con.getAllStudent();
		assertNotNull(list);
	}
	
}
