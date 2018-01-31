package Two;
import java.util.Scanner;

public class Assignment_Two_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How big should the array be?");
		
		int arraySize = input.nextInt();
		int arraySum = 0;
		int[] numbers;		
		numbers = new int[arraySize]; 
		System.out.println("arraySize is " + arraySize);
		
		for(int j=0; j <(arraySize); j++) {
			System.out.println("Enter value at index " + j);
			int indexVal =input.nextInt();
			numbers[j] = indexVal;
			}
		
		System.out.println("Your array looks like this");
		for(int i=0; i<(arraySize); i++) {
			System.out.print(numbers[i] + "\t");
			arraySum += numbers[i];				
			}
		System.out.println("\nSum of all numbers in array = " + arraySum);
			
		}
	}
