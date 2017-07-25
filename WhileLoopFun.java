/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopFun {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	boolean validInput = false;
	double input;

	while(!validInput){
	System.out.println("Enter a number 1 - 100: ");
	input=keyboard.nextDouble();
		if(0<input&&input<101){
		valid=true;
		}

		else{
		System.out.print("Invalid input");
	}
	

	}//End main method
}//End class