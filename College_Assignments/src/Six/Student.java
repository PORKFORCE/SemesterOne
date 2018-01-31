package Six;

public abstract class Student {
	private String name;
	private long id;
	private String grade;
	private int[] test = new int[3];		//each student takes three exams, no need to make an array list.
	private static final int NUM_TESTS = 3;
	//Constructors
	public Student(){
		
	}
	public Student(String name, long id){
		this.name = name;
		this.id = id;
	}
	//Mutators
	public void setName(String name) {
		this.name = name;
	}
	public void setID(long id) {
		this.id = id;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	//Each student sits three exams, function takes the exam number and the mark, and puts it into the test array.-1 to offset zero indexing
	//(so the client doesn't have to ask what result you got for exam 0)
	public void setTestScore(int examNo, int mark) {
		test[examNo-1]  = mark;
	}
	//Accessors
	public  int getTestScore(int examNo) {
		return test[examNo-1];
	}
	public int getNumTests() {
		return NUM_TESTS;
	}
	public String getName() {
		return name;
	}
	public long getID() {
		return id;
	}
	public String getGrade() {
		return grade;
	}
	//Overridden toString returns name and id for easy outputting.
	public String toString() {
		return this.name + ", ID: " + this.id;	
	}
	//Will define method body in PostGrad and UnderGrad subclasses
	public abstract void calculateResult(); 		
}	
