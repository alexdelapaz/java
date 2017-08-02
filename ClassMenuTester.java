/**	Alex de la Paz	


*/

import java.util.Scanner;
import java.util.*;

public class ClassMenuTester {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	ClassMenu mainMenu = new ClassMenu();
	mainMenu.addOption("Create new user account");
	mainMenu.addOption("Log in - existing user");
	mainMenu.addOption("Quit");

	int input = mainMenu.getInput();
	System.out.println("Input: " + input);

	System.out.println("Object reference for menu: " + mainMenu);

	}//End main method
}//End class