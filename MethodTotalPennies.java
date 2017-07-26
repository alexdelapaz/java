/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodTotalPennies {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
//Without method
	System.out.println(100*20.35);
	System.out.println((100*20.35)%100);
	System.out.println(Math.round((100*20.35)%100));

//With method

	double pennies = 20.35;
	int totalPennies = totalPennies(pennies);
	System.out.print(totalPennies);
	
	}//End main method



	/**
		A method to calculate amount of pennies in a double money value input.
		@param input double money value.
		@return the pennies in double money value.
	*/


	public static int totalPennies(double input){

	return (int) Math.round((100*input)%100);
	}


}//End class