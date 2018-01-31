package Seven;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class Employee  {

	public static void main(String[] args) {
		//program information
		System.out.println("This program takes in ACME employee details and displays their personal details and sales info."
				+ "\n\n\t***If you wish to exit the program, type '3'.To Print records press '4'.***"
				+ "\n-------------------------------------------------------------------------------------------------");
		//bulk of calculations and variable assignments done in check()		
		check();
		//for  deserialization, writing to and reading from file.
		//serializeEmployee();
		deserializeEmployee();
		fileWrite();
		//when all methods are finished
		System.out.println("Program Terminated");
		
		
		
	}//end main
	//Create arraylist to hold the SalesEmployees input by the user
	public static ArrayList<SalesEmployee> empList= new ArrayList<SalesEmployee>();
	
	//takes inputs, assigns information to SalesEmployee Objects
	static void check() {
		System.out.println("\n\nChoices:\n [1] Sales Agent\n [2] Sales Person\n [3] Write/Save to file then Exit\n "
							+ "[4] Print Employees so far\n [5] Read Employees saved in File\n\n");
		//for displaying currency in the right format
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
		int choice = input.nextInt();
		try {
			if( choice == 3) {
				return;
			} else if ( choice == 1||choice == 2) {
				System.out.println("Please enter first name: ");
				String fname = input.next();
				System.out.println("Please enter surname: ");
				String lname = input.next();
				System.out.println("Please enter PPSN: ");
				String pps = input.next();
				System.out.println("Please enter employee sales: ");
				double empSales = input.nextDouble();
					if (choice == 1) {
						SalesAgent agent = new SalesAgent(fname, lname, pps);
						agent.sales = empSales;
						empList.add(agent);
						check();
					}//end if
					if (choice == 2) {
						SalesPerson person = new SalesPerson(fname, lname, pps);
						person.sales = empSales;
						empList.add(person);
						check();
					}//end if
			//choice 4 prints loops through all the employees in the ArrayList and prints their info	
			} else if (choice == 4) {
				for(SalesEmployee i: empList) {
					System.out.println("*******************************************************************************");
					System.out.println(i.toString());
					i.calculateCommission();
					
					System.out.println("Commission (based on sales of :€" + i.sales+  "): €" + df.format(i.commission));
					System.out.println("TOTAL EARNINGS (sales + commission) :€" + (i.sales + i.commission) + "\n");
				}System.out.println("*******************************************************************************");
				check();
			} else if (choice == 5) { //prints employees previously written to File
				readFile();
				check();
			}else {
				System.out.println("Incorrect value entered. 1 for Sales Agent, 2 for Sales Person, or 3 to exit");
				check();
			}//end else
		} finally {
			input.close();
		}//end close input stream 
		serializeEmployee();
	}//end check()
	
	//method to serialize the SalesEmployee objects 
	static void serializeEmployee() {
		try {
			//create a connection stream (write bytes)
			FileOutputStream fileStream = new FileOutputStream("EmployeeInfo.dat");
			
			//create a chain stream (allows objects to be written to a stream)
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			//call writeObject() on the Object stream
			os.writeObject(empList);
			
			os.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}//end serializeEmployee()
	
	//unflattens the serialized SalesEmployee objects from the objectOutputstream
	static void deserializeEmployee() {
		try {
			FileInputStream fileStream = new FileInputStream("EmployeeInfo.dat");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			//wasn't sure what to cast here, can you tell me in the assignment comments? Sound :)(unchecked cast error)
			List<SalesEmployee> emps = (List<SalesEmployee>)os.readObject();   
				for( SalesEmployee element:emps) {
					System.out.println(element.toString());
				}//end for
			
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}//end try/catch
	}//end deserialize method
	
	//method to write info to a file
	static void fileWrite() {
		try {
			FileWriter fileWriter = new FileWriter("EmployeeList.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("\nEmployee List \n");
			double totalSales = 0.0;
				for(SalesEmployee element:empList) {
					totalSales +=element.sales;
					element.calculateCommission();
					writer.write("Name: " + element.getFirstName() + " " +element.getLastName() + " \n");
					writer.write("PPS Number: " + element.getPPS()+ " \n");
					
					if(element instanceof SalesAgent) {
						writer.write("10% Commission: " + Double.toString(element.commission) + "\n");
					}//end if
					else {
						writer.write("15% Commission: " + Double.toString(element.commission) + "\n");
					}
					writer.write("TOTAL (sales + commission) : €" + (Double.toString(element.sales + element.commission)) + "\n");
					writer.write("\n");
				}//end for
				writer.write("TOTAL TOTAL SALES OF EVERYONE: €" + totalSales);
				writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}//end try/catch
	}//end filewrite()
	
	//method to read from the file created above 
	static void readFile() {
		try {
			File employeeFile = new File("EmployeeList.txt");
			FileReader fileReader = new FileReader(employeeFile);
			BufferedReader reader = new BufferedReader(fileReader);
			//prints until it comes to an empty line
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//end try/catch
	}//endReadFile	
}//end main


