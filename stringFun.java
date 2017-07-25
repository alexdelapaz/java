/**	Alex de la Paz	


*/

import java.util.Scanner;

public class stringFun {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	String firstName;
	String lastName;	

	System.out.print("Enter first name: ");
	firstName=keyboard.next();	

	System.out.print("Enter last name: ");
	keyboard.nextLine(); 			//**Must enter "keyboard.nextLin();" so next doesnt reas invisible character.
						//next(); to nextLine();
	lastName=keyboard.nextLine();

	System.out.println("\nYour name is " + firstName 
	+ " " + lastName);
	

	//Ch chars

	System.out.println("charAt(3) method returns " + firstName.charAt(3));


	//.length();

	System.out.println("Length of lastName is " + lastName.length());
	
	System.out.println("Last character of lastName is " + lastName.charAt(lastName.length()-1));


	//toUpperCase();

	System.out.println("firstName: " + firstName +" to upperCase is " 
	+firstName.toUpperCase());


	//toLowerCase();
	
	System.out.println("lastName: " + lastName +" to lowerCase is " 
	+lastName.toLowerCase());


	//.substring();

	System.out.println("substring(1,4) is " + lastName.substring(1,4));

	System.out.println("substring(3) is " + lastName.substring(3));

	String sub1 = lastName+=lastName.substring(3);
	System.out.println("String lastName + sub1 is " + lastName+sub1);
	
	
	}//End main method
}//End class