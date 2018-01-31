package Six;
	
public class PostGrad extends Student{
	
	public PostGrad() {
		
	}
	//Constructor
	public PostGrad(String name, long id) {
		this.setName(name);
		this.setID(id);
		
	}
	//Pass if above or equal to 50, Fail if lower. Gets the test scores from the test array to compute.
	public void calculateResult() {
		int total = this.getTestScore(1) + this.getTestScore(2) + this.getTestScore(3);
		System.out.println("Total marks :" + total);
		int avg = total/3;
		System.out.println("Average :" + avg);
		if(avg >= 50) {
			this.setGrade("Pass");
			System.out.println("You passed");
		} else {
			this.setGrade("Fail");
			System.out.println("Ya done failed");
		}
	}
}
