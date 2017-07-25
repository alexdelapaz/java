/**	Alex de la Paz	


*/

import java.util.Scanner;

public class doWhileInputValidationMethod {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter lowest value for input: ");
	int lowInput=keyboard.nextInt();

	System.out.print("Enter highest value for input: ");
	int highInput=keyboard.nextInt();
	
	System.out.println("Valid input recieved: " + readUntilHigh(lowInput, highInput));	//Method call within System.out.print
	//int validInput = readUntilHigh(lowInput,highInput);					//Method call and assign return.
	//System.out.println(validInput);

	}//End main method



	/**
		A method that takes an integer input as the highest and lowest value to 
		accept and returns the input.
		@param highValue the highest value to accept.
		@param lowValue the lowest value to accept.
		@return the Integer authorize to be accepted within the paramaters.
	*/


	public static int readUntilHigh(int lowValue, int highValue){

		int input;
		Scanner keyboard =new Scanner(System.in);
		do{
		System.out.print("Enter integers " + lowValue + " - " + highValue + ": ");
		input=keyboard.nextInt();
		}
		while(lowValue>input||input>highValue);
		return input;
	}


}//End class