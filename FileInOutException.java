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

	//Prompt for input and output file names.
	System.out.print("Input file: ");
	String inputFileString = keyboard.next();
	System.out.print("Outputfile: ");
	String outputFileString = keyboard.next();			//*next() to nextln() can cause it to read extra space.
						
			
	File inputFile = new File(inputFileString);	//File class		
	Scanner readFile = new Scanner(inputFile);	//Scanner input
							//		Scanner readFile = new Scanner(new File(inputFileString);							
	PrintWriter outputFile = new PrintWriter(outputFileString);	
							//PrintWriter class
									
									//String inputFileString  C:\Users\Alex\Documents\GitHub\JavaLibrary\input.txt
									//String outputFileString C:\Users\Alex\Documents\GitHub\JavaLibrary\output.txt
									//String literal "C:\\Users\\Alex\\Documents\\GitHub\\JavaLibrary\\input.txt"
									//String literal "C:\\Users\\Alex\\Documents\\GitHub\\JavaLibrary\\output.txt"



	String inputWord=readFile.nextLine();
	readFile.close();		//close() Scanner
	outputFile.close();		//close() PrintWriter

									
	//Begin here	
}//End Try

	catch (IOException exception){
	exception.printStackTrace();
	System.out.println("Error. Could not open file.");
	}
	catch (IllegalArgumentException exception){
	System.out.println(exception.getMessage());
	}
 


	}//End main method

}//End class