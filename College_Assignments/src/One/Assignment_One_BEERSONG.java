package One;

public class Assignment_One_BEERSONG {

	public static void main(String[] args) {
		
		String word = "bottles";		
		
		for (int i = 99; i > 0 ; i--) {
			if (i ==1) {
				word = "bottle";
			}
			
			System.out.println(i +" "+ word +" of beer on the wall");
			System.out.println(i + " "+ word +" of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			if (i >1) {
				System.out.println(i + " "+word+" of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}//end for

	} //end main
} // end class
