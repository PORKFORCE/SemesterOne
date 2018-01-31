package Four;
import java.util.List;				
import java.util.LinkedList;
//allows us to use ArrayList methods like .add() and .size()
//import java.util.ArrayList;			

public class IntegerArray {

	public static void main(String[] args) {
		
		//creating a new array list to hold Integer objects
		List<Integer> ints = new LinkedList<>();		

		//Will populate the ArrayList using a normal for loop, the length of 10 is arbitrary.
		for(int i = 0; i < 10; i++) { 
			
			/*Adds 10 random Integer objects to the ArrayList, each primitive int will be between 0 and 100.
			Casting the random number to an int, as the default return type is a double.*/
			int a =(int)(Math.random()*100);
			
			/*Autoboxing taking place on each instance of 'a'(Primitive int type wrapped by Integer object-wrapper class),
			as the ArrayList will only hold objects. */
			ints.add(a);				
		}//end for
		
		//checking the array is the correct size
		System.out.println("    Array contains " + ints.size() + " integers"+ "\n--------------------------------------");
		 	
		//Using an enhanced for loop to traverse the Integer array printing out each value.

		//Auto-unboxing taking place on each Integer 'i'(unwrapped to their primitive int form).
		for(int i:ints) {
			System.out.print(i + "  ");
		}//end enhanced for
		
		//Removing the Integer at index a, zero is arbitrary choice. 
		int a = 0;
		ints.remove(a);
		//Printing the new ArrayList size to make sure
		System.out.println("\n\n\tIndex: " + a + " removed!");
		System.out.println("\n    Array now contains " + ints.size() + " integers"+ "\n--------------------------------------");
		
		//The new shorter array printed out using an enhanced for loop
		for(int i:ints) {
			System.out.print(i + "  ");
		}
	}//end main
}//end class
