package Five;

public class Movie {
	//class variables
	private String title;
	private String genre;
	private int rating;
	
	//generic and parametrized constructors
	public Movie() {};
	public Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	//getters for each private data member
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getRating() {
		return rating;
	}
	
	//setters for each private data member
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//modified playIt method
	public void playIt() {
		System.out.println(this.title + " - Now Playing");
	}
}
