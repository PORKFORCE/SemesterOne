package Algorithms;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		System.out.println(" Enter 5 numbers ");
		*/
		
		int [] test = new int[6];
		
		test[0] = 1;
		test[1] = 299;
		test[2] = 39;
		test[3] = 414;
		test[4] = 500;
		test[5] = 24;
	
		
		mergeSort(test, 0, test.length);
	}//end main
	
	
	static void merge(int Array[], int first, int middle, int last) {
		//stores start points of two arrays(1 taken in to be sorted, 1 created: aux) in L(left array) and R(right array)  (temporary variables)
		int L = first, R = middle + 1;
		int []aux = new int[last - first+1];	//creates the auxillary array
		int counter = 0;
		
		for (int i = first; i <= last; i++) {	//starts at first index, this will be 0 in first array but different in every other
			//Left Array
			if(L > middle) {					//if its greater, then left array is finished
				aux[counter++] = Array[R++];	//increases both array indexes by one	
			} else if (R > last) {																//if one of these comes to an end, then all the elements are
//////////////////////////////////////////////////////////////////////////////////////////////////transferred to the aux array in the same order they exist
			//Right Array						//if its greater, then right array is finished
				aux[counter++] = Array[L++];	//increases both array indexes by one			
			} else if (Array[L] < Array[R]) {
				aux[counter++] = aux[L++];		//checks which of the two arrays has the smallest element.
			} else {							//if L is smaller, store it in the auxillary array aux
				aux[counter++] = Array[R++];	//otherwise, store R.
			}
			
		}
		for ( L = 0; L < counter; L++) {
			//Now the real array has elements in sorted manner including both parts
			Array[first++] = aux[L];
		}	
	}// end merge
	static void mergeSort(int Array[], int first, int last) {
		if (first < last) {
			int middle = (first + last)/2;		//divides the array in 2, assigns a middle value     
			mergeSort(Array, first, middle);		//sorts first part
			mergeSort(Array, middle+1, last);		//sorts second part
			
			merge(Array, first, middle, last);
		}
	}
}//end class
