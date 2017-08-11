import java.util.Scanner;

public class CosmicSuperClass{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	String stringLine = keyboard.toString();
	System.out.println(stringLine);

	System.out.println();

	System.out.println("stringLine="+keyboard);

	System.out.println();
	Question questionOne = new Question();
	System.out.println("stringLine="+questionOne);

	}//End main method

}//End Cosmic Super Class