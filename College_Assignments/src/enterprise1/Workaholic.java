package enterprise1;

public class Workaholic extends Employee{
	
	public static final int OVERTIME = 500;
	
	public Workaholic(String name, float hourlyIncome, int age) {
		super(name, hourlyIncome, age);
	}

	public void work(){
		int hours = 2000;
		float pay = ( hours + OVERTIME) * (this.getHourlyIncome());
		this.setEarned(this.getEarned() + pay);	
	}
	

}
