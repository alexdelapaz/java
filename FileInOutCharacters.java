/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class FileInOutCharacters {

	public static void main(String[] args)  throws FileNotFoundException 
						//throw exceptions
						{

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
									
	//Begin here
/*
	while(readFile.hasNext()){
	String lineInput = readFile.nextLine();
	System.out.println(lineInput);
	}
*/
	readFile.useDelimiter("");			//"" Empty String Delimiter filters unwanted content based off parameters
							//Reads one 'Character' at a time
							//Works with readFile.next(); not readFile.nextLine();
	//read words only at a time
	while(readFile.hasNext()){
	//	String wordInput = readFile.next();
	//	System.out.println(wordInput);
	char charInput = readFile.next().charAt(0);		//Works same as processing like String above^
	System.out.println(charInput);

	//	System.out.println("I digit: " + Character.isDigit(charInput));		//Determines if char isType();
	}
										//Character.isDigit();
										//Character.isLetter();
										//Character.isUpperCase();
										//Character.isLowerCase();
										//Character.isWhiteSpace();


	readFile.close();		//close() Scanner
	outputFile.close();		//close() PrintWriter

	}//End main method

}//End class