package Five;

public class Students {
	//private class variables
	private String name;
	private String course;
	private int id;
	
	//parameterized constructor
	public Students(String name, String course, int id) {
		this.name=name;
		this.course=course;
		this.id=id;
	}
	//getter methods for each private data member
	public String getName(){
		return name;
	}
	public String getCourse() {
		return course;
	}
	public int getId() {
		return id;
	}
	
	//setter methods for each private data member
	public void setName(String name){
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//overridden toString method, returns all (pre-formatted) instance variables when called 
	public String toString() {
		return("Student name is: " + name + ". Current course: " + course + ". ID no." + id);
	}
	
}
