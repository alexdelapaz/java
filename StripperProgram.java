/* 	Alex
	Program
 */

import java.util.Scanner;

public class StripperProgram {

	public static void main(String [] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.println("What is the name of your first pet? ");
	String firstPet = keyboard.nextLine();

	System.out.println("What is your first street you grew up on? ");
	String streetName = keyboard.nextLine();

	System.out.println("Your stripper name is\t\t" + firstPet + "\t" + streetName);
	System.out.printf("%-15s%15s%15s", "Your stripper name is ", firstPet, streetName);
	System.out.println();
	System.out.printf("Your stripper name is %15s%15s", firstPet, streetName);

	}

}

	