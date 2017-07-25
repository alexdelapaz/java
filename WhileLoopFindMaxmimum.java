/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopFindMaxmimum {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter numbers (Q to quit): ");
	double maximum=keyboard.nextDouble();			//Begin first with double maximum = keyboard.nextDouble();

	while(keyboard.hasNextDouble()){
	double input=keyboard.nextDouble();					//Then double input = keyboard.nextDouble();
		if(input>maximum){
		maximum=input;
		}
	}
	System.out.print("\tLargest number of those entered: " + maximum);

	}//End main method
}//End class