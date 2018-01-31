package Algorithms;
import java.util.Scanner;

public class Fibonacci_non_recursive {

	public static void main(String[] args) {
		//New Scanner object to read inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate the fibonacci series to the value of?");
		int userInput = input.nextInt();
		//Call the method on the input
		fibonacci(userInput);

	}//end main
	static void fibonacci(int n) {
		/* If you think of the Fibonacci sequence as pairs of numbers then the first number in the pair
		 * Im calling initial(init), and the second, current(curr).The first number in the following pair will always be the sum of 
		 * the previous pair(init= curr + init). The second number in a pair will be itself plus the first number in the pair(curr = curr + init).
		 */
		int init = 0;
		int curr = 1;
		int i = 0;
		int total = 0;
		//fibonacci(1) should return 1
		if (n == 1) {
			total = 1;	
		}
			for (i = 0; i < (n/2); i++) {			
				total += curr + init;							//running total
				System.out.print(init + ", " + curr + ", ");	//couldn't get figure out how to get rid of the final comma, I'm ashamed to say :(
				init = curr + init;
				curr = curr + init;			
			}
			
			//because the function outputs pairs, odd numbers for n will be missing a fibonacci number at the end.
			//Fix with the following if statement.
			if(n % 2 != 0){															 //Odd numbers			
				System.out.println(init);       									 //Prints final value	
				System.out.println("\nTotal of all numbers: " + (total + init));
			}else {
				System.out.println("\nTotal of all numbers: " + total);				//This will only run for even values of n
			}//end else
	}//end  fibonacci method
}//end class
