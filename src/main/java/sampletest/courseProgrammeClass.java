package sampletest;

import java.util.ArrayList;

public class courseProgrammeClass {

	String CourseName;
	String startDate;
	String endDate;
	ArrayList<String> moduleList = new ArrayList<String>();
	ArrayList<String> StudentList = new ArrayList<String>();
	
	public ArrayList<String> getStudentList() {
	    return StudentList;
	  }

	public ArrayList<String> getModuleList() {
	    return moduleList;
	  }
	
	public void setCourseName(String CourseName) {
		CourseName = CourseName;

	}

	public String getCourseName() {
	      return CourseName;

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