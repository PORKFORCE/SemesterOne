package Five;
import java.util.Scanner;

public class Movie_Driver {

	public static void main(String[] args) {
		//new scanner object to read user input
		
		
		//instantiating 3 new movie objects
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();
		
		//creating an array to hold the movies
		Movie[] movieList = new Movie[3];
		
		//populating the array
		movieList[0] = movie1;
		movieList[1] = movie2;
		movieList[2] = movie3;
		
		
		for(int i = 0; i < movieList.length; i++) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter the title of movie " + (i+1) + ": ");
			String userTitle= input.nextLine();
			movieList[i].setTitle(userTitle);
			
			System.out.println("Please enter the genre of movie " + (i+1) + ": ");
			String userGenre= input.nextLine();
			movieList[i].setGenre(userGenre);
			
			System.out.println("Please enter the rating (1-5) for movie " + (i+1) + ": ");
			int userRating = input.nextInt();
			movieList[i].setRating(userRating);
		}
		
		for(int i = 0; i < movieList.length; i++) {
			System.out.println("Movie " + (i+1)  +" Title: "+ movieList[i].getTitle());
			System.out.println("Movie " + (i+1)  +" Genre: "+ movieList[i].getGenre());
			System.out.println("Movie " + (i+1)  +" Rating: "+ movieList[i].getRating());
			movieList[i].playIt();
		}

	}
	
}
