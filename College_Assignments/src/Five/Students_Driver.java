package Five;
import java.util.List;
import java.util.ArrayList;
public class Students_Driver {

	public static void main(String[] Args) {
		
		//creating 3 instances of the student class
		Students student1= new Students("Ganoes Paran", "Software Development", 345);
		Students student2= new Students("Kalam Mekhar", "Hardware Development", 1897);
		Students student3= new Students("Benjamin Delat", "Middleware Development", 1367);
		
		//creating an arrayList to hold the 3 instances of students that we created above
		List <Students> studentList = new ArrayList<>();
		
		//adding each object to the ArrayList individually
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		//printing instance variables of each arrayList object by means of the overridden toString method.
		//this tests constructor method
		for(Students i:studentList) {
			System.out.println(i.toString());
		}
		
		//modifying instance variables to test setters and getters
		student1.setName("Precious Thimble");
		student2.setCourse("Occultism");
		student3.setId(666);
		
		System.out.println(student1.getName() + " " + student2.getCourse() + " " + student3.getId());

	}
}