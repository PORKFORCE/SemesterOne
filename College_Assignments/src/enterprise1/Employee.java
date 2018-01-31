package enterprise1;

public abstract class Employee {
	
	public static final int RETIREMENT_AGE = 65;
	private String name;
	private int age;
	private float earned;
	private float hourlyIncome;
	
	//CONSTRUCTORS
	public Employee() {
		this.name  = null;
		this.age  = 0;
		this.earned  = 0.0f;
		this.hourlyIncome = 0.0f;
	}
	public Employee(String name, float hourlyIncome, int age) {
		this.name = name;
		this.hourlyIncome = hourlyIncome;
		this.age = age;
		//Must add extra parameter(overload) in worker subclass
	}

	//GETTERS
	public float getHourlyIncome() {return this.hourlyIncome;}
	public float getEarned() {return this.earned;}
	
	//SETTERS
	public void setHourlyIncome(float hourlyIncome) {this.hourlyIncome = hourlyIncome;}
	public void setEarned(float earned) {this.earned = earned;}
	
	//needs subclass specific overriding 
	public abstract void work();
	
	/*public void work() {
		while(age++ < RETIREMENT_AGE)
			work(1600);
	} */
	
	public String info() {return name + " earned " + earned;}
	
}
