/**	Alex de la Paz	


*/

import java.util.Scanner;

public class BooleanMethod {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int input = keyboard.nextInt();

	if(blankMethod(input)){
	System.out.print(input+" is even.");
	}
	else{
	System.out.print(input+" is odd.");
	}


	}//End main method

	/**
		A blank method that determines if an integer is even or odd.
		@param blankParamVariable the Blank Parameter Variable.
		@return the Return Variable
	*/


	public static boolean blankMethod(int blankParamVariable){

	return (blankParamVariable%2==0);
	}

	


}//End class