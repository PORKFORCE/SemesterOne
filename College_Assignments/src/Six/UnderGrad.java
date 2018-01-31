package Six;

public class UnderGrad extends Student{
	public UnderGrad() {
				
	}
	public UnderGrad(String name, long id) {
		this.setName(name);
		this.setID(id);
	}
	//Pass if above or equal to 40, Fail if lower. Gets the test scores from the test array to compute.
	public void calculateResult() {
		int total = this.getTestScore(1) + this.getTestScore(2) + this.getTestScore(3);
		System.out.println("Total marks :" + total);
		int avg = total/3;
		System.out.println("Average :" + avg);
		if(avg >= 40) {
			this.setGrade("Pass");
			System.out.println("You passed");
		} else {
			this.setGrade("Fail");
			System.out.println("Ya done failed");
		}
	}
}
