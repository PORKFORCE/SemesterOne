package Four;
import java.util.Scanner;

public class Temperature_Converter {

	public static void main(String[] args) {

	//check validates user input and either runs the appropriate function, or returns to terminate program.
	check(); 
	System.out.println("Program Terminated");

	} //end main
	
	static void check() {
		
		//Program description
		System.out.println("1.Fahrenheit to Celsius" +
		"\n2.Celsius to Fahrenheit" +
		"\n3.Exit");
		System.out.println("Choice: ");
		
		//new scanner object to read user inputs
		Scanner input = new Scanner(System.in);
		
		//read desired function
		int choice = input.nextInt();
		try { 									//this is so the input stream can be closed afterwards
			if (choice == 1 || choice == 2) {	//in the case that computations will need to be made
				System.out.println("Enter Temperature: ");
				double temp = input.nextDouble();	//Doesn't say specifically what kind of inputs should be taken, only that outputs should be of type int!
				if(choice == 1) {
					int answer = celsius(temp);		//call celsius method to convert a fahrenheit temperature
					System.out.println((int)temp + " Fahrenheit is " + answer + " Celsius\n");
					check();						//allows user to input again
				} else if (choice == 2){			
					int answer = fahrenheit(temp);  //call fahrenheit method to convert a celsius temperature
					System.out.println((int)temp + " Celsius is " + answer + " Fahrenheit\n");
					check();
				}
			}//end if
			
			else if (choice == 3) {					//return to main method to terminate program
				return;
			} else {
				System.out.println("Please enter 1, 2 or 3\n");  //prevents incorrect input
				check();
			} //end else
	} finally {
		input.close();								//stops resource leak on input stream
	}
	}	
	static int celsius(double f){					//wasn't sure whether fractional values could be input, so played it safe :)
		int c = (int)((5.0/9.0)*(f - 32));
		return c;
	}
	static int fahrenheit(double c){
		int f = (int)((9.0/5.0)*c + 32);
		return f;
	}
}
