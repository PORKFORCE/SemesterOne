package Six;
//import java.util.Scanner;

public class Client extends PostGrad {

	public static void main(String[] args) {
		//Instantiation of three new Student objects, with names and IDs. Postgrad and undergrad assignations are arbitrary.
		PostGrad jimmyJo = new PostGrad("Jimmy Joe", 3457419);
		UnderGrad bobbyJim = new UnderGrad("Bobby Jim", 9842929);
		PostGrad jeanMay = new PostGrad("Jean May", 5722929);
		//Creating a new array to hold the three new Students.
		Student[] examStudents = new Student[3];
		//Setting the testscores which reside in the test array for computing the final grade. First parameter refers to exam number, second is mark.
		jimmyJo.setTestScore(1, 10);
		jimmyJo.setTestScore(2, 60);
		jimmyJo.setTestScore(3, 80);
		bobbyJim.setTestScore(1, 100);
		bobbyJim.setTestScore(2, 90);
		bobbyJim.setTestScore(3, 90);
		jeanMay.setTestScore(1, 5);
		jeanMay.setTestScore(2, 25);
		jeanMay.setTestScore(3, 2);
		//Populating the array.
		examStudents[0] = jimmyJo;
		examStudents[1] = bobbyJim;
		examStudents[2] = jeanMay;
		
		/*
		System.out.println(jimmyJo.getTestScore(2));	
		System.out.println(jimmyJo.getName());
		
		Student one = new PostGrad();
		Student two = new UnderGrad();
		Student three= new PostGrad();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter name of student 1");
		String oneName= userInput.nextLine();
		System.out.println("Please enter id of student 1");
		long oneID = userInput.nextLong();
		System.out.println("Please enter name of student 1");
		*/
		
		//Looping through Student array and printing relevant info with the overridden toString and calculateResult methods.
		for(Student i:examStudents) {
			
			System.out.println(i.toString());
			i.calculateResult();
			System.out.println();
			
		}
	}
	
}
