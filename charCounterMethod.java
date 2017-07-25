/**	Alex de la Paz	


*/

import java.util.Scanner;

public class charCounterMethod {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

	String string="hello";
	char character='o';

	System.out.print("The string\"" + string +"\" has " 
	+ countChar(string,character) + " ");
	System.out.print(character);
 	System.out.print(" characters in it.");

	
	}//End main method



	/**
		A method that counts the amount of char in a given String.
		@param string the string to count included char amount.
		@param character the char input to search for amount String holds.
		@return the charCounter integer amount.
	*/


	public static int countChar(String string, char character){
		int charCounter=0;
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i)==character){
			charCounter++;
			}
		}
		return charCounter;
	}


}//End class