package sampletest;

import java.awt.List;
import java.util.ArrayList;

public class moduleClass {


	String moduleName;
	String moduleID;
	String AssociatedCourses;
	String StudentList;

	moduleClass(String moduleName,String moduleID, String AssociatedCourses, String StudentList)
	  {  
	      this.moduleName = moduleName;  
	      this.moduleID = moduleID;
	      this.AssociatedCourses = AssociatedCourses;
	      this.StudentList = StudentList;
	      
	    }
	
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
	
	public String getAssociatedCourseslist() {
	    return AssociatedCourses;
	  }
	
	public String getStudentList() {
	    return StudentList;
	  }
	
}
