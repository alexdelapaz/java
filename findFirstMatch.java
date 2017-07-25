/**	Alex de la Paz	


*/

import java.util.Scanner;

public class findFirstMatch {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	String word = "ALEX de la Paz";
	boolean found = false;
	char ch;
	int position = 0;

	while(!found && position < word.length()){

	ch = word.charAt(position);
	
	if(Character.isLowerCase(ch)){
	found=true;
	}

	else{
	position++;
	}

	}

	System.out.print("Lowercase character found at position: " + position);

	}//End main method
}//End class