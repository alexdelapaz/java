/**	Alex de la Paz	


*/

import java.util.Scanner;

public class minAndMax {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	//Compare numbers and find smallest number

	System.out.println("Please enter numbers(Q to quit): ");
	double smallest=keyboard.nextDouble();

	while(keyboard.hasNextDouble()){
	double input = keyboard.nextDouble();

	if(input<smallest){
	smallest=input;
	}

	}

	System.out.print("The smallest number is: " + smallest);
	

	

	}//End main method
}//End class