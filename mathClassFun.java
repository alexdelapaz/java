/**	Alex de la Paz	


*/

import java.util.Scanner;

public class mathClassFun {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	int num1, num2;
	System.out.println("Enter two numbers: ");

	num1=keyboard.nextInt();
	num2=keyboard.nextInt();

	//Max & Min

	System.out.print("\nThe larger number is: " 
	+ Math.max(num1,num2));
	
	int bigger = Math.max(num1,num2);
	
	System.out.print("\nThe smaller number is: " 
	+ Math.min(num1,num2));

	int smaller = Math.min(num1,num2);


	//Msth.abs

	System.out.print("\nThe absolute value of " + num1 
	+ " is " + Math.abs(num1));

	//Math.sqrt & Math.cbrt

	System.out.print("\nThe square root of " + num1 
	+ " is " + Math.sqrt(num1));

	System.out.print("\nThe cubed root of " + num1 
	+ " is " + Math.cbrt(num1));

	
	//Math.pow
	System.out.print("\nThe power of " + num1 
	+ " to " + num2 + " is " + Math.pow(num1,num2));


	//Math.random

	//Math.random - is a random number in the range [0.0 - 1.0]
	System.out.print("\nRandom number: "+ Math.random());

	//Math.random - To get a random number between [0.0 - num2)
	System.out.print("\nRandom number: "+ Math.random()*num2);

	//Math.random - To get a random number between [0.0 - num2]
	System.out.print("\nRandom number: "+ Math.random()*num2 + 1);

	//Math.random - To get a random number between [num1 - (num1 + num2) )
	System.out.print("\nRandom number: "+ Math.random() * num2 + num1 );


	
	// To get a random number between [b - a] use
	//        (int) Math.random() * (b - a + 1) + a);

	// To get a random number between [num1 - num2] use
	//        (int) Math.random() * (num2-num1+1) + num1);
	System.out.print("\nRandom number between " 
	+ num1 + " and " + num2 + " is " + (int) (Math.random() * (num2-num1+1) + num1));

	
	//Math.PI
	System.out.print("\nMath.PI in double variable representation is " + Math.PI);

	}//End main method
}//End class