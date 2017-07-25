/**	Alex de la Paz	


*/

import java.util.Scanner;

public class promptUntilMatch {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	boolean validNum=false;
	double input=0;

	while(!validNum){
	System.out.println("Enter a positive integer below 100");
	input = keyboard.nextDouble();
	
			if(0<input && input<100){
			validNum=true;
			}
	
			else{
			System.out.println("Please enter a valid number");
			}

	}

	System.out.print("You entered: " + input);

	}//End main method
}//End class