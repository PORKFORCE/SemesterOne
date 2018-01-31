package Three;
import java.util.Scanner;

public class Assignment_Three_DIGITCOUNT {

	public static void main(String[] args) {
		/* 10^1 = 10_____same as___ log10   = 1 (base 10)
		 * 10^2 = 100____same as___ log100  = 2 (base 10)	
		 * 10^3 = 1000___same as___ log1000 = 3 (base 10)
		 * Can use this for counting digits of non-negative integers.
		 * Number of digits in integer x = log(x) + 1 (base 10)
		 * 
		 * To account for negative integer inputs, the Math.abs method will be used beforehand.
		 */
		
		System.out.println("This program counts the number of digits in an integer entered by the user."
				+ "\nEnter -1 to exit");			//Description before method call, so its only printed once.
			
		check();									//Method call.The main bulk of the program is contained within.
		
		System.out.println("Program Terminated...");//This will print if user enters -1, 
													//stopping the method calling itself
	}
	static void check() {
		Scanner input = new Scanner(System.in);		//Creating a new scanner object to read user inputs.
		System.out.println("\nEnter number: ");		//Prompts input.
		int a = (input.nextInt());					//Variable to hold the input.
		if (a == -1) {								//A break case to stop the method infinitely calling itself.
			return;									//Return to line 20
		}else {
			int b = Math.abs(a);					/*Must be positive for logs to work.If used
													on 'a', the return case would no longer work*/
			int answer = (int)((Math.log10(b)) + 1);//Must cast to an int as the log method returns a double.
			System.out.print("Number of digits in " + a + " is " + answer);//Prints the answer
			check();								//Calls the method again, starting from user input.
		} //end else	
	} //end method
	
}//end class