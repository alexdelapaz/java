/**	Alex de la Paz	


*/

import java.util.Scanner;

public class countUpperCaseMatches {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	int upperCaseLetters=0;
	String word="SUperCAlaFRAGilisTICexpEALAdocious";
	
	for(int i =0; i<word.length(); i++){
	char ch = word.charAt(i);

	if(Character.isUpperCase(ch)){
	upperCaseLetters++;
	}

	}
	System.out.print("Upper Case Letters: " +upperCaseLetters);

	}//End main method
}//End class