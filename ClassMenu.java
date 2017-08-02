/**	Alex de la Paz		
	A menu displayed.
*/

import java.util.Scanner;
import java.util.*;
//import java.util.Arrays;
//import java.util.List;

public class ClassMenu {

	private ArrayList<String> options;	//Declare: Array list of options
	private Scanner keyboard;		//Declare: Scanner for user input

/**	
	Constructs menu with no options.
*/
	public ClassMenu(){
	options = new ArrayList<String>();	//Initialize: Instance Array
	keyboard = new Scanner(System.in);	//Initialize: Instance Scanner

	}//End Constructor

/**	
	Adds an option for the menu.
	@param option adds a String option.
*/
	public void addOption(String option){
	options.add(option);			//Uses Array list options to addOption
	}

/**
	Displays menu with options and prompts the user for input. 
	Repeats until a valid input is supplied.
*/

	public int getInput(){
	int input;

		do{
			for(int i=0; i<options.size(); i++){
			int menuChoice = i+1;
			System.out.println(menuChoice + ")" + options.get(i));
			}

		input = keyboard.nextInt();	
		}

		while(input < 1 || input > options.size());

	return input;
	}

	
}//End class