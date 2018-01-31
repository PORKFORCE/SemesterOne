package Seven;
import java.io.Serializable;

public abstract class SalesEmployee implements Serializable{
	private String firstName;
	private String lastName;
	private String ppsNumber;
	protected double sales;
	protected double commission;
	
	public SalesEmployee() {};
	
	public SalesEmployee(String firstName, String lastName, String ppsNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPPS(String pps){
		this.ppsNumber = pps;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPPS() {
		return this.ppsNumber;
	}
	public String toString() {
		return this.firstName + " " + this.lastName + ", PPSN: " + this.ppsNumber  + ". ";
	}
	public abstract void calculateCommission();	
	
}
