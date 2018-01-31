package Seven;

public class SalesPerson extends SalesEmployee{
	
	public SalesPerson() {};
	
	public SalesPerson(String firstName, String lastName, String ppsNumber) {
		this.setFirstName(firstName);
		this.setlastName(lastName);
		this.setPPS(ppsNumber);
	}

	
	public void calculateCommission() {
		this.commission = sales * 0.15;		
	}
	
	
	
}
	