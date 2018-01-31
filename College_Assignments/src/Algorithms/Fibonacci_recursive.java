package Algorithms;
import java.util.Scanner;

public class Fibonacci_recursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive int");
		int userInput = input.nextInt();
		
		
		System.out.println("\n Fibonnaci number:" + userInput + " is " + fibonacci(userInput-1));
		
	}
	
	static int fibonacci(int n) {
		
		int fib = n;
		int runningTotal;
		int total = n;
		//System.out.println("\tGrand total = " + runningTotal);
		if (n == 1||n == 0) {
			//int fib=0;
			//int total=0;
			//System.out.println(n + " is base case ");
			/*
			System.out.println("\n total equals: " + total);
			fib = n;
			System.out.println("\n total equals: " + total);
			total+=n;
			
			*/
			
			//System.out.println("fib = " + fibonacci(n));
			//System.out.println("\ttotal so far = " + n);
			//System.out.println("\tN(base case) = " + n);
			//runningTotal=n;
			//System.out.println("\t total(base case) = " + runningTotal);
			return n;
			
			
		} else{
				//runningTotal=n;
				//runningTotal +=n;
				System.out.println("\tN = " + n);
				//System.out.println(x);
				//System.out.println("fib = " + fibonacci(n));
				//int total = fib;
				//total += fib;
				//System.out.print(fib);
				//System.out.println(" " + fibonacci(n-1) + " " + fibonacci(n-2) + " " );
				//total += fib;
				//runningTotal += runningTotal;
				//System.out.println("\t total = " + runningTotal);
				return(fibonacci(n-1) + fibonacci(n-2));
				//System.out.println(" Total is : ");
				
			}
			//System.out.println(n);
		
		}
		
			
	}
	

