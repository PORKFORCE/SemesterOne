package Seven;

public class SalesAgent extends SalesEmployee{
	
	public SalesAgent() {};
	
	public SalesAgent(String firstName, String lastName, String ppsNumber) {
		this.setFirstName(firstName);
		this.setlastName(lastName);
		this.setPPS(ppsNumber);
	}


	public void calculateCommission() {
		this.commission = sales * 0.10;

	}
	
	
	
}
