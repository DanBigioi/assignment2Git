package sampletest;

public class studentClass {
	
	  String Name;
	  int Age;
	  String DOB;
	  int ID;
	  
	  studentClass(int ID,String Name, int Age, String DOB)
	  {  
	      this.ID = ID;  
	      this.Name = Name;
	      this.Age = Age;
	      this.DOB = DOB;
	      
	    }

	public void setName(String Name) {
	      Name = Name;

	}

	public String getName() {
	      return Name;

	}

	public void setAge(int Age) {
	      Age = Age;

	}

	public int getAge() {
	      return Age;

	}
	
	public void setDOB(String DOB) {
	      DOB = DOB;

	}

	public String getDOB() {
	      return DOB;

	}
	
	public String getUserName(String Name, String Age) {
	      return Name + Age;

	}
	
	public void setID(int ID) {
	      ID = ID;

	}

	public int getID() {
	      return ID;

	}
	

}
