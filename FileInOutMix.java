/**	Alex de la Paz	


*/

import java.util.*;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
public class FileInOutMix {

	public static void main(String[] args)  throws FileNotFoundException 
						//throw exceptions
						{

	Scanner keyboard = new Scanner(System.in);

	//Prompt for input and output file names.
	System.out.print("Input file: ");
	String inputFileString = keyboard.next();		
			
	File inputFile = new File(inputFileString);	//File class		
	Scanner readFile = new Scanner(inputFile);	//Scanner input

	//read lines
try{
	while(readFile.hasNextLine()){
	String countryName = readFile.nextLine();
	double population = readFile.nextDouble();
	System.out.println("Country: "+countryName+" Population: "+population);
	readFile.nextLine();
	}
}
	catch (NoSuchElementException exception){
	System.out.println(exception.getMessage());
	System.out.println("Something went wrong in the .next()");
	}
	catch (IllegalArgumentException exception){
	System.out.println(exception.getMessage());
	}

	finally{
	readFile.close();			//close() Scanner
	}

	}//End main method

}//End class