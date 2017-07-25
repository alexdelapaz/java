/**	Alex de la Paz	


*/

import java.util.Scanner;

public class ForLoopFun {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);


	//////////////////////////////////////////////////For loop Integers
								
	int counter=0;
	
	for(int i=0; i<10; i++){
	System.out.print("Loop: "+i);
	
	counter++;
	System.out.println("\tCounter: "+counter);
	}

	
	///////////////////////////////////////////////////For loop string.length();

	counter=0;					//re-assignment of counter to 0
	String string1="Alexander de la Paz";

	for (int i=0; i<string1.length(); i++){

	System.out.print(string1.charAt(i));
	
		char character1 = string1.charAt(i);	//Search for a specific char
		if(character1 == 'x'){
		counter++;
		}
	}
	
	System.out.print("\nFirst 'x' character found at posn: " + counter);

	}//End main method
}//End class