/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodInterestOverYears {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter initial balance: ");
	double initialBalance = keyboard.nextDouble();

	System.out.print("Enter interest rate: ");
	double rate = keyboard.nextDouble();

	System.out.print("Enter amount of years: ");
	int years = keyboard.nextInt();

	double balance = interestCalculator(initialBalance, rate, years);
	System.out.println("The final balance after "+years+" years is " + balance);

	System.out.println("Interest accrued: "+(balance-initialBalance));
	
	}//End main method



	/**
		A blank method that computes the sum of two doubles.
		@param blankParamVariable the Blank Parameter Variable.
		@return the Return Variable
	*/


	public static double interestCalculator(double initialBalance, double rate, int years){

	return initialBalance*Math.pow(1+rate/100, years);
	}


}//End class