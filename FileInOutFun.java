/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class FileInOutFun {

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
	int count=0;
	int total=0;

	while(readFile.hasNextInt()){
	
	int inputInt = readFile.nextInt();		//must use variable - if use readFile.nextInt(); if will literal into every call
	count++;
	total +=inputInt;

	System.out.printf("%4d\n", inputInt);	//Console print
	outputFile.printf("%4d\n", inputInt);	//Print to outputFile
	
		if(count%2==0){
		System.out.println();	
		outputFile.println();
		}
	}
	
	if(count%2==1){
	System.out.println();	
	outputFile.println();
	}
	System.out.printf("Total %8d\n", total);	
	outputFile.printf("Total %8d\n", total);
	
	outputFile.println("Test");

	readFile.close();		//close() Scanner
	outputFile.close();		//close() PrintWriter

	}//End main method

}//End class