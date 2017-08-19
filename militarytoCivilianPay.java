/*	
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class militaryToCivilianPay{

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	NumberFormat formater = NumberFormat.getCurrencyInstance();

	System.out.println("\tThis program calculates civilian pay needed before " +
	"\n\tFederal Taxes to equal the same pay as an Active Duty Service Member " +
	"\n\tafter Federal taxes.");

	System.out.print("Enter yearly military salary after taxes: ");
		double milSal=0;

	if(keyboard.hasNextDouble()){
		
		milSal=keyboard.nextDouble();


		if(milSal<0||milSal>500000){
		System.out.print("This salary is higher than military pay.");
		}
		else {
		
		
			
	final double FEDTAXCALC = 1.25;
	final double RATELOW = 0.10;
	final double RATEHIGH = 0.25;
	final double RATELOW_SINGLE = 32000;
	final double RATELOW_MARRIED = 64000;

	double civSal = (((milSal*FEDTAXCALC)-RATELOW_SINGLE)*RATEHIGH)+(RATELOW_SINGLE*RATELOW);
	civSal+=milSal;
	System.out.print("Civilian Salary needed after taxes: "+formater.format(civSal));
		
	/*****************
	System.out.print("Enter State of residence (Use abbreviation): ");
	String state = keyboard.next();

	if(!(state.equals"AK")&&(!state.equals"fl")&&(!state.equals"NV")
	&&(!state.equals"SD")&&(!state.equals"TX")&&(!state.equals"WA")
	&&(!state.equals"WY")){

	}


	*******************/	
	}
	
	
	}

	else {
	System.out.println("\tMust enter a salary.");
	}
	
	}
}
