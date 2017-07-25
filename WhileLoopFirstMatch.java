/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopFirstMatch {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	boolean found = false;
	int position = 0;
	char character;
	String string1 = "111alexander de la Paz";
							//First match char.hasLowerCase();
	while(!found && position<string1.length()){
		
		character=string1.charAt(position);
		
		if(Character.isLowerCase(character)){
		found=true;
		}
		else{
		position++;
		}
	}
	System.out.println("Lowercase character found at posn: " + position);
	

	}//End main method
}//End class