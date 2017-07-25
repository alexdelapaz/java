import java.util.Scanner;

/*

 */

public class StringCompare{

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		String Name="Alex";
		if ("Alexander".equals("Alex")){
		System.out.print("Alexander");
		}

		else if(Name.equals("Alex")){
		System.out.print("Alex");
		}
		
		if("Alexander de la Paz".substring(0,9).equals("Alexander")){
		System.out.print("\nAlexander");
		}

		////To compare Strings

		//Don't use //// if (string1 == string2) 

		//Use .equals
		
		String string1 = "a string";
		String string2 = "a string";
		if (string1.equals(string2)){
		System.out.println("\nstring1 equals string2");
		}

		//or use .compareTo

		if(string1.compareTo(string2)<0){
		System.out.println(string1 + " comes first.");
		}
		else if(string1==string2){
		System.out.println(string1 + " and " + string2 + " are equal.");
		}
		else{
		System.out.println(string2 + " comes first.");
		}


		//Don't use 

		//String name ="Alexander";
		//String nickname = name.substring(0,4);
		//if(nickname="Alex")		//Test is False

		//Use:
		//String nickname = "Alex";
		//if(nickname == "Alex")	//Test is True


		//Compare Strings in alphabetical order:

		System.out.println("Enter three strings:");
		String stringOne = keyboard.nextLine();
		String stringTwo = keyboard.nextLine();
		String stringThree = keyboard.nextLine();

		String temp;

		//Compare first two strings and swap them.
			
		if(stringOne.compareTo(stringTwo)>0){
		temp=stringOne;
		stringOne=stringTwo;
		stringTwo=temp;
		}

		//Compare first and third strings and swap them.
			
		if(stringOne.compareTo(stringThree)>0){
		temp=stringOne;
		stringOne=stringThree;
		stringThree=temp;
		}

		//Compare second and third strings and swap them.
			
		if(stringTwo.compareTo(stringThree)>0){
		temp=stringTwo;
		stringTwo=stringThree;
		stringThree=temp;
		}
		
		System.out.println("Strings in alphabetical order: ");
		System.out.println(stringOne);
		System.out.println(stringTwo);
		System.out.println(stringThree);
		
		////EPSILON

		final double EPSILON = 1E-14;
		double y = Math.sqrt(2.0);
		if(Math.abs(y*y-2.0)<EPSILON){
		System.out.println("\nMath.sqrt(2.0) squared is approx " +
		y*y);
		}
	}
}