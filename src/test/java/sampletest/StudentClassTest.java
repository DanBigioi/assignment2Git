package sampletest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentClassTest {

	@Test
	public void testGetUsername() {
		studentClass student = new studentClass(1, "Dan", 21, "September");
		
		String Name = student.getName();
		int Age = student.getAge();
		
		System.out.print(student.getUserName(Name, Integer.toString(Age)));
		
		assertEquals("Dan21", student.getUserName(Name, Integer.toString(Age)));
	}

}

