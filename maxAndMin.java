/**	Alex de la Paz	


*/

import java.util.Scanner;

public class maxAndMin {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	//Compare numbers and find largest number

	System.out.println("Please enter numbers(Q to quit): ");
	double largest=keyboard.nextDouble();

	while(keyboard.hasNextDouble()){
	double input = keyboard.nextDouble();

	if(input>largest){
	largest=input;
	}

	}

	System.out.print("The largest number is: " + largest);
	

	

	}//End main method
}//End class