package sampletest;

import java.awt.List;
import java.util.ArrayList;

public class moduleClass {


	String moduleName;
	String moduleID;
	ArrayList<String> AssociatedCourses = new ArrayList<String>();
	ArrayList<String> StudentList = new ArrayList<String>();

	
	
	public void setModuleName(String moduleName) {
		moduleName = moduleName;

	}

	public String getModuleName() {
	      return moduleName;

	}
	
	
	public void setModuleID(String moduleID) {
		moduleID = moduleID;

	}

	public String getModuleID() {
	      return moduleID;

	
	}
	
	public ArrayList<String> getAssociatedCourseslist() {
	    return AssociatedCourses;
	  }
	
	public ArrayList<String> getStudentList() {
	    return StudentList;
	  }
	
}
