package sampletest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseProgrammeTest {

	@Test
	public void testCourseProgramme() {
		courseProgrammeClass course = new courseProgrammeClass("Engineering", "2016", "2020", "ct1,ct2,en1,en2", "dan,dave,derry");
		
		String courseName = course.getCourseName();
				
		assertEquals("Engineering", courseName);
	}

}

