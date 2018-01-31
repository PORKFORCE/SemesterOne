package enterprise1;

public class Worker extends Employee{
	
	private Worker coWorker = null;
	
	public Worker(String name, float hourlyIncome, int age, Worker coWorker) {
		super(name, hourlyIncome, age);
		this.coWorker = coWorker;
	}

	private void delegate(int hours) {
		coWorker.work();
	}

	public void work(){
		int hours = 1600;
		float pay = (hours  * (this.getHourlyIncome()));
		this.setEarned(this.getEarned() + pay);
		int delHours = hours/5;
		if (coWorker != null)
			coWorker.work();
	}	
		
}

	

