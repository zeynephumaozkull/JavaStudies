
public class Course {
	//Purpose is to create a Course constructor that has name, id, instructor fields
	
	public Course(){  //constructor
		
	}
	public Course(String name, int id, String instructorName, int completionPercentage) {
		this.name=name;
		this.id=id;
		this.instructorName=instructorName;
		this.completionPercentage=completionPercentage;
		
	}
	
	//fields
	String name;  
	int id;
	String instructorName;
	int completionPercentage;
	
	
	

}
