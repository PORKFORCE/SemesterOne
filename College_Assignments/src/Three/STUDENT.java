package Three;

public class STUDENT {

	private String name;
	private long IDnumber;

	public STUDENT() { // generic constructor

	}

	public STUDENT(String name, long IDnumber) { // constructor with parameters
		this.name = name;
		this.IDnumber = IDnumber;
	}

	public String getName() { // getter for name
		return name;
	}

	public void setName(String name) { // setter for name
		this.name = name;
	}

	public long getIDnumber() { // getter for id
		return IDnumber;
	}

	public void setIDnumber(long id) { // setter for id
		IDnumber = id;
	}

	public String toString() { // overloaded toString method
		return this.getName();
	}
}
