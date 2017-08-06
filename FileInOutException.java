/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
public class FileInOutException {

	public static void main(String[] args)  throws FileNotFoundException 
						//throw exceptions
						{
	try{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Outputfile: ");
	String outputFileString = keyboard.next();
	PrintWriter outputFile = new PrintWriter(outputFileString);
							//PrintWriter() Cannot exist withint Try bounds
	try{
		//Prompt for input and output file names.
		System.out.print("Input file: ");
		String inputFileString = keyboard.next();		
			
		File inputFile = new File(inputFileString);	//File class		
		Scanner readFile = new Scanner(inputFile);	//Scanner input
		

		String inputWord=readFile.nextLine();

		readFile.close();		//close() Scanner

	}//End Nested Try

	finally{
	outputFile.close();
	}

	}//End Outer Try

	//Catch exceptions
	catch (IOException exception){
	exception.printStackTrace();
	System.out.println("Error. Could not open file.");
	}
	catch (IllegalArgumentException exception){
	System.out.println(exception.getMessage());
	}


	}//End main method

}//End class