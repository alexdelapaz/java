import java.util.Scanner;

public class CosmicSuperClass{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	String stringLine = keyboard.toString();
	System.out.println(stringLine);

	System.out.println();

	System.out.println("stringLine="+keyboard);

	System.out.println("Question one has been created.");
	System.out.println();
	Question questionOne = new Question();
	System.out.println("stringLine="+questionOne);

	System.out.println();
	
	System.out.println("Question two has been created.");
	Question questionTwo = new Question();
	System.out.println("stringLine="+questionTwo);

	System.out.println("Question one and two are equal: "+questionOne.equals(questionTwo));

	}//End main method

}//End Cosmic Super Class