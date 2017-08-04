/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.net.*;		
import javax.swing.JFileChooser;	//Import JFileChooser

public class FileInOutFileChooser {

	public static void main(String[] args)  throws IOException
						//throw exceptions
						{

	Scanner keyboard = new Scanner(System.in);

	//Prompt for input and output file names.
	//	System.out.print("Input file: ");
	//	String inputFileString = keyboard.next();
	//	System.out.print("Outputfile: ");
	//	String outputFileString = keyboard.next();			//*next() to nextln() can cause it to read extra space.
						
			
	//	File inputFile = new File(inputFileString);	//File class		
	//	Scanner readFile = new Scanner(inputFile);	//Scanner input
							//		Scanner readFile = new Scanner(new File(inputFileString);							
	//	PrintWriter outputFile = new PrintWriter(outputFileString);	
							//PrintWriter class
									
									//String inputFileString  C:\Users\Alex\Documents\GitHub\JavaLibrary\input.txt
									//String outputFileString C:\Users\Alex\Documents\GitHub\JavaLibrary\output.txt
									//String literal "C:\\Users\\Alex\\Documents\\GitHub\\JavaLibrary\\input.txt"
									//String literal "C:\\Users\\Alex\\Documents\\GitHub\\JavaLibrary\\output.txt"				
									
	//Prompt for web address to read
	
	JFileChooser chooser = new JFileChooser();
	Scanner in = null;
	if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){

	File selectedFile = chooser.getSelectedFile();
 	readFile = new Scanner(selectedFile);
	}

	//	readFile.close();		//close() Scanner
	//	outputFile.close();		//close() PrintWriter

	}//End main method

}//End class