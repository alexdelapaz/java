/**	Alex de la Paz	


*/

import java.util.Scanner;

public class RecursiveMethodFactorial {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter a number to calculate factorial: ");
	long input = keyboard.nextDouble();
	long output = factorialCalculator(input);
	System.out.print(output);
	}//End main method



	/**
		A recursive method that computes the factorial of a number.
		@param factorialInput the factorial input Parameter Variable.
		@return the factorial product.
	*/


	public static long factorialCalculator(long factorialInput){

		if(factorialInput<=1){
		return 1;
		}
		else{
		long returnVariable = factorialInput*factorialCalculator(factorialInput-1);
		return returnVariable;
		}
	}


}//End class