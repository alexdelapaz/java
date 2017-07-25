/**	Alex de la Paz	


*/

import java.util.Scanner;

public class comparingData {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	final double EPSILON=0.00000000000000000000000000000000001;

	//Numbers are only equal if they are the same number.
	System.out.println("Enter two numbers to be squared & checked to "
	+ "see if they are equal.");
	double num1=keyboard.nextDouble();
	double num2=keyboard.nextDouble();
	
	if(Math.abs(Math.sqrt(num1)-Math.sqrt(num2))<EPSILON){
	System.out.print("The numbers entered are essentially equal.");
	}

	}//End main method
}//End class