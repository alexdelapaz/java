/**	Alex de la Paz	


*/

import java.util.Scanner;
							//Import File,PrintWriter, and FileNotFoundException class.
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class FileInOutExtractor {

	public static void main(String[] args)  throws FileNotFoundException 
						//throw exceptions
						{

	Scanner keyboard = new Scanner(System.in);
	
	Scanner inputFile1 = new Scanner(new File("worldpop.txt"));
	Scanner inputFile2 = new Scanner(new File("worldarea.txt"));

	PrintWriter outputFile = new PrintWriter("world_pop_density.txt"); 

	//Read nextLine() from each file
	while(inputFile1.hasNextLine() && inputFile2.hasNextLine()){
	String linesFile1 = inputFile1.nextLine();
	String linesFile2 = inputFile2.nextLine();
	
	
	//Extract country and value
	String countryName = extractCountry(linesFile1);
	double population = extractValue(linesFile1);
	double area = extractValue(linesFile2);

	//Compute and output density
	double density=0;
					//Sentinel against division by 0
		if(area!= 0 ){			
		density=population/area;
		}
		outputFile.printf("%-40s%15.2f\n",countryName,density);
	}



	inputFile1.close();		//close() Scanner	
	inputFile2.close();		//close() Scanner
	outputFile.close();		//close() PrintWriter

	}//End main method


/**
	Extracts first word from a word-number mixed file.
	@param line a line containing the word of mixed file.
	@return the word in a mixed file
*/
	public static String extractCountry(String input){
	int i=0;
	while(!Character.isDigit(input.charAt(i))){
	i++;
	}
	return input.substring(0, i).trim();
	}//End method

/**
	Extracts value from a word-number mixed file.
	@param line a line containing the value in the mixed file.
	@return the value in a mixed file
*/
	public static double extractValue(String input){
	int i=0;
	while(!Character.isDigit(input.charAt(i))){
	i++;
	}
	return Double.parseDouble(input.substring(i).trim());
	}//End method

/*	//Begin here

	//	readFile.useDelimiter("[^A-Za-z]+");		//Delimiter filters unwanted content based off parameters
							//Works with readFile.next(); not readFile.nextLine();
	//read lines
	while(readFile.hasNextLine()){
	String wordInput = readFile.nextLine();
	//	System.out.println(wordInput);
	
	int i =0;
	while(!Character.isDigit(wordInput.charAt(i))){
	i++;
	}

	String countryName = wordInput.substring(0,i);
	countryName=countryName.trim();					//.trim() 		method to trim white space at the end of words

	//	String population = wordInput.substring(i);			//.trim() whitespace from int before parsing
	//	population = Integer.parseInt(population.trim());
	int population = Integer.parseInt(wordInput.substring(i));	//Integer.parseInt() 	method

	System.out.printf("%-15s %4d \n", countryName,population);


	}
*/


}//End class