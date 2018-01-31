package Three;

public class STUDENT_TESTER {

	public static void main(String[] args) {
		STUDENT[] students;								//creating a variable to hold the array of STUDENT objects
		
		students = new STUDENT[4];						//creating a new array of STUDENTS of size 4
		
		students[0] = new STUDENT();					//instantiating a new STUDENT for index[0] (generic constructor)
		students[0].setName("Bill Gates");				//using the  name setter method
		students[0].setIDnumber(12345);					//using the  ID   setter method
		
		students[1] = new STUDENT("Steve Wozniak", 666);//instantiating a new STUDENT for index[1](using parameterised constructor)
		students[1].setIDnumber(66666);					//modifying IDnumber to correct length
		
		students[2] = new STUDENT();					//instantiating a new STUDENT for index[2] (generic constructor)
		students[2].setName("Elon Musk");
		students[2].setIDnumber(10101);
		
		students[3] = new STUDENT("Chris Poole", 69420);//instantiating a new STUDENT for index[3](using parameterised constructor)
		
		int j=1;										//Need a variable to count iterations of the enhanced for loop. 
														//I tried using 'i' but it called the .toString method for some reason! Confused.
		
		for(STUDENT i :students) {
			System.out.println("\nSTUDENT NUMBER " + j + "\n---------------------- " + "\nName: " + i.getName() 
			+" ID Number: " + i.getIDnumber()); 
			j++;
		}

	}

}
