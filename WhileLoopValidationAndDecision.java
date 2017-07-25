/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopValidationAndDecision {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.println("This program calculates the GCD of two integers.");

//Decision Do-While-Loop

	String again;					//Do-While decision String
	do{


	System.out.print("Enter first integer(positive integers):");

//First number Validation While-Loop

	int num1=keyboard.nextInt();

//Positive boolean check
	boolean valid=true;				//Boolean to keep track if input is positive

	while(num1<=0){					//Validation (num1<=0) While-Loop
	System.out.print("\nNumber must be positive."
	+ " Re-enter: ");
	num1=keyboard.nextInt();			//**Res-scan using num1=keyboard.nextInt();  or loop is infinite
	
	valid=false;					//Boolean false-positive update	
	}
	
	if(!valid){					
	System.out.println();
	}						//Boolean false test Space added
							//If positive - number is allowed to pass
	
//Second number validation
	
	System.out.print("Enter second integer:");
	int num2=keyboard.nextInt();

	while(num2<=0){					//Validation (num1<=0) While-Loop
	System.out.println("\nNumber must be positive."
	+ " Re-enter");
	num2=keyboard.nextInt();			//**Res-scan using num1=keyboard.nextInt();  or loop is infinite
	}

//Process information
	
	String firstNumbers = "\ngcd(" +num1+", "+num2+")";

	int length=0;
	
	System.out.print("gcd(" +num1+", "+num2+") ");

//spaces trick

	String spaces="";
	for(int i =0; i<firstNumbers.length(); i++){
	spaces+=" ";
	}

	while(num1!=num2){

//Calculate GCD
		if(num1>num2){
		num1 -=num2;
		}
		else{
		num2-=num1;
		}
	System.out.print("= gcd(" +num1+", "+num2+")");
	length++;
	
//Spaces trick	if(length>1){
		System.out.print("\n" + spaces);
		}
	System.out.println("It took " + length + " steps to calculate gcd.");
	System.out.println("Numers used: "+num1+" " +num2);

//Do-While decision
	System.out.print("Would you like to find more gcd: (Y/N)?");
	again=keyboard.next();
	
	} //End Do-While

	while(again.equalsIgnoreCase("y"));			//Do-While condition
	
	}//End main method
}//End class