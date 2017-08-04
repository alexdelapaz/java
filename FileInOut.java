/**	Alex de la Paz	


*/

import java.util.Scanner;
import java.io.File;		//Import file class.

public class FileInOut {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	
	File inputFile = new File("input.txt");
	Scanner readFile = new Scanner(inputFile);

	Printwriter outputFile = new Printwriter("output.txt");	

	}//End main method

}//End class