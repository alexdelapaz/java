/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodVoidPrintString {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter a string: ");
	String input = keyboard.nextLine();
	voidPrintString(input);					//Method call
	
	}//End main method



	/**
		A blank Void method that prints text surrounding an input String.
		@param blankParamVariable the Blank Parameter Variable.
		@return the Return Variable
	*/


	public static void voidPrintString(String blankParamVariable){

		for(int i=0; i<blankParamVariable.length()+2; i++){
		System.out.print("-");
		}
		System.out.println();
		System.out.println("!" + blankParamVariable + "!");
		for(int i=0; i<blankParamVariable.length()+2; i++){
		System.out.print("-");
		}

	}


}//End class