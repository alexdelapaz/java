/**	Alex de la Paz	


*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class DataAnalyzer {

	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);

	boolean done = false;
	while(!done){

		try{

		System.out.print("File name: ");
		String inputFileString = keyboard.next();
	
		double[] data = readFile(inputFileString);

	double sum=0;
	for(double d: data){
	sum+=d;
	}
	System.out.println("The sum is "+sum);

	done=true;
	}
	
	catch (FileNotFoundException exception){
 	System.out.println("File not found.");
 	}
 	catch (NoSuchElementException exception){
 	System.out.println("File contents invalid.");
	}
	catch (IOException exception){
 	exception.printStackTrace();
 	}

	}//End while

	}//End main method

public static double[] readFile(String inputFileString) throws IOException {
File inputFile = new File(inputFileString);
Scanner readFile = new Scanner(inputFile);
	try{
	return readData(readFile);
	}
	finally{
	readFile.close();
	}
}//End Static Method

public static double[] readData(Scanner readFile) throws IOException {
	int numberOfValues = readFile.nextInt(); // May throw NoSuchElementException
 	double[] data = new double[numberOfValues];
 	
	for (int i = 0; i < numberOfValues; i++){
 	data[i] = readFile.nextDouble(); // May throw NoSuchElementException
 	}

 	if (readFile.hasNext()){
	throw new IOException("End of file expected");
	}

	return data;

}//End Static Method

}//End class