/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopEndSentinel {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter values(-1) to finish");

	boolean finished = false;
	double value = keyboard.nextDouble();

	while(!finished){			//Sentinel boolean fence

		value=keyboard.nextDouble();
		if(value==-1){			//Boolean value determiner
		finished=true;
		}
		
			//PROCESS INFORMATION HERE
	}

	System.out.print("End of Sentinel loop.");

	}//End main method
}//End class