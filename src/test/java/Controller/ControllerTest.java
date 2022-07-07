package Controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sushant.Controller.StudentController;
import com.example.sushant.model.StudentModel;

@SpringBootTest
public class ControllerTest {

	@Autowired
	StudentController con=new StudentController();
	
	@Test
	public void testController() {
		con.saveStudent(new StudentModel("123","Sushant Chaudhari","Ahmednagar","BCS"));
		ArrayList list=con.getAllStudent();
		assertNotNull(list);
	}
	
	
}
