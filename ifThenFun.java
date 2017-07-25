/*	
 */

import java.util.Scanner;

public class ifThenFun {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter a case number: ");
	int numberChooser = keyboard.nextInt();

	switch(numberChooser){
	case 1: numberChooserName = "One"; break;
	case 2: numberChooserName = "Two"; break;
	case 3: numberChooserName = "Three"; break;
	default: numberChooserName = "Who knows?"; break;
	}


	}
}
