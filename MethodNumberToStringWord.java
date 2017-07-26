/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodNumberToStringWord {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter a positive integer < 1000: ");
	int input = in.nextInt();
	System.out.println(intName(input));
	}

	/**
		Turns a number into its English name.
		@param number a positive integer < 1,000
		@return the name of the number (e.g. “two hundred seventy four”)
	*/

	public static String intName(int number){
	int part = number; // The part that still needs to be converted
	String name = ""; // The name of the number

		if (part >= 100){
		name = digitName(part / 100) + " hundred";
		part = part % 100;
		}
		if (part >= 20){
		name = name + " " + tensName(part);
		part = part % 10;
		}
		else if (part >= 10){
		name = name + " " + teenName(part);
		part = 0;
		}
		if (part > 0){
		name = name + " " + digitName(part);
		}
		return name;
		}


	}//End main method



	/**
		A blank method that computes the sum of two doubles.
		@param blankParamVariable the Blank Parameter Variable.
		@return the Return Variable
	*/



	/**
		Converts the digits 1-9 to thier English names in String type.
		@param digit an integer 1-9.
		@return the English name one-nine in a String type.
	*/
	public static String digitName(int digit){
		if (digit == 1){
		return"one";
		}
		if (digit == 2){
		return"two";
		}
		if (digit == 3){
		return"three";
		}
		if (digit == 4){
		return"four";
		}
		if (digit == 5){
		return"five";
		}
		if (digit == 6){
		return"six";
		}
		if (digit == 7){
		return"seven";
		}
		if (digit == 8){
		return"eight";
		}
		if (digit == 9){
		return"nine";
		}
		return"";
	}

	/**
		Converts the numbers 10-19 to thier English names in String type.
		@param teens an integer 10-19.
		@return the English name ten-nineteen in a String type.
	*/
	public static String teenName(int teens){
		if (teens == 10){
		return"ten";
		}
		if (teens == 11){
		return"eleven";
		}
		if (teens == 12){
		return"twelve";
		}
		if (teens == 13){
		return"thirteen";
		}
		if (teens == 14){
		return"fourteen";
		}
		if (teens == 15){
		return"fifteen";
		}
		if (teens == 16){
		return"sixteen";
		}
		if (teens == 17){
		return"seventeen";
		}
		if (teens == 18){
		return"eighteen";
		}
		if (teens == 19){
		return"nineteen";
		}
		return"";
	}

	/**
		Gives the name of the tens part of a number between 20 and 99.
		@param number an integer between 20 and 99
		@return the name of the tens part of the number (“twenty” . . . “ninety”)
	*/
	public static String tensName(int number){
		if (number >= 90){ 
		return "ninety"; 
		}
		if (number >= 80){ 
		return "eighty"; 
		}
		if (number >= 70){ 
		return "seventy"; 
		}
		if (number >= 60){ 
		return "sixty"; 
		}
		if (number >= 50){ 
		return "fifty"; 
		}
		if (number >= 40){ 
		return "forty"; 
		}
		if (number >= 30){ 
		return "thirty"; 
		}
		if (number >= 20){ 
		return "twenty"; 
		}
		return "";
}


}//End class