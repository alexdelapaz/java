/**	Alex de la Paz	


*/

import java.util.*;
import java.text.NumberFormat;

public class ifElseFun {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	final int MINOR = 18;

	System.out.print("Enter age: ");
	int age = keyboard.nextInt();

	if(age<MINOR){
	System.out.println("Enjoy your youth and health.");
	}

	System.out.println("Age is a state of mind");
	
	System.out.println("///////////////////////////////////////////////");


	final int MAX=10, SMALL=1;
	int answer, guess;

	Random ranGen = new Random();
	answer = ranGen.nextInt(MAX)+SMALL;

	System.out.print("I am thinking of a number between " + SMALL + " and " 
	+ MAX + " guess what it is: ");

	guess = keyboard.nextInt();

	if (guess==answer){
	System.out.println("You got the guess right the answer is: " + answer);
	}
	else{
	System.out.print("You did not guess correctly. " + answer + " was the answer.");
	}

	System.out.println("///////////////////////////////////////////////");

	
	
	

	}//End main method
}//End class