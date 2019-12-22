package sampletest;

import java.util.ArrayList;

public class courseProgrammeClass {

	String courseName;
	String startDate;
	String endDate;
	String moduleList;
	String StudentList;
	
	courseProgrammeClass(String courseName,String startDate, String endDate, String moduleList, String StudentList)
	  {  
	      this.courseName = courseName;  
	      this.startDate = startDate;
	      this.endDate = endDate;
	      this.StudentList = StudentList;
	      this.moduleList = moduleList;
	    }
	
	public String getStudentList() {
	    return StudentList;
	  }

	public String getModuleList() {
	    return moduleList;
	  }
	
	public void setCourseName(String CourseName) {
		CourseName = CourseName;

	}

	public String getCourseName() {
	      return courseName;

	}
	
	public void setStartDate(String startDate) {
		startDate = startDate;

	}

	public String getStartDate() {
	      return startDate;

	}
	
	public void setEndDate(String endDate) {
		endDate = endDate;

	}

	public String getEndDate() {
	      return endDate;

	}
	
}