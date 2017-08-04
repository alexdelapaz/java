/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class FileInOutLines {

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

	//	readFile.useDelimiter("[^A-Za-z]+");		//Delimiter filters unwanted content based off parameters
							//Works with readFile.next(); not readFile.nextLine();
	//read lines
	while(readFile.hasNextLine()){
	String wordInput = readFile.nextLine();
	System.out.println(wordInput);
	
	int i =0;
	while(!Character.isDigit(wordInput.charAt(i))){
	i++;
	}

	String countryName = wordInput.substring(0,i);
	countryName=countryName.trim();				//Trim white space at the end of words

	String population = wordInput.substring(i);

	System.out.print(countryName+ " " + population +"\n");


	}


	readFile.close();		//close() Scanner
	outputFile.close();		//close() PrintWriter

	}//End main method

}//End class