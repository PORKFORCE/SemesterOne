package One;
import java.util.Scanner;
import java.text.DecimalFormat;
//IMPORTING SCANNER FOR INPUT, DECIMALFORMAT FOR CURRENCY FORMATTING
public class Assignment_One_TICKETS{

	public static void main(String[] args) {
		//CREATING NEW SCANNER OBJECT TO READ INPUTS
		//CREATING A NEW DECIMALFORMAT OBJECT TO SET FORMAT STYLE AND TO CHANGE DECIMAL INPUTS TO THE STYLE
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		//INPUTTING SECTION
		System.out.println("Enter number of A seats sold: ");
		int a=input.nextInt();
		System.out.println("Enter price of A tickets: ");
		Double a$=input.nextDouble();
		String aDec = df.format(a$);
		
		System.out.println("Enter number of B seats sold: ");
		int b=input.nextInt();
		System.out.println("Enter price of B tickets: ");
		Double b$=input.nextDouble();
		String bDec = df.format(b$);
		
		System.out.println("Enter number of C seats sold: ");
		int c=input.nextInt();
		System.out.println("Enter price of C tickets: ");
		Double c$=input.nextDouble();
		String cDec = df.format(c$);
		
		Double totalSales = (a*a$)+(b*b$)+(c*c$);
		String totalSales$ = df.format(totalSales);
	
		//PRINTING RESULTS, MAKING IT LOOK PRETTY
		System.out.println("\n\t\tTickets Sold\t Price per Ticket");
		System.out.println("\t\t------------\t ----------------");
		System.out.println("A Tickets:\t    " + a + "\t\t\t" + aDec);  //2 tabs was too much, it looked bad, please believe
		System.out.println("B Tickets:\t    " + b + "\t\t\t" + bDec);      
		System.out.println("C Tickets:\t    " + c + "\t\t\t" + cDec);
		
		System.out.print("\n\t\tTotal Sales € " + totalSales$);
		
				
	}

}
