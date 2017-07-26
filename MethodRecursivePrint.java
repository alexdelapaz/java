/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodRecursivePrint {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please enter a desired side length for triangle.");
	int input = keyboard.nextInt();
	printTriangle(input);


	System.out.print("Please enter a desired side length for triangle.");
	int recursiveInput = keyboard.nextInt();

	printTriangleRecursive(recursiveInput);
	}//End main method


	/**
		A blank method that computes the sum of two doubles.
		@param blankParamVariable the Blank Parameter Variable.
		@return the Return Variable
	*/


	public static void printTriangle(int sideLength){
		for(int i=0; i<sideLength; i++){
			for(int j=0; j<i; j++){
			System.out.print("[]");
			}
		System.out.println();
		}

	}


	
	public static void printTriangleRecursive(int sideLength){
		
		if(sideLength<1){				//If conditional sentinel to filter negative input
		return;
		}

		//printTriangleRecursive(sideLength-1);

			for(int i=0; i<sideLength; i++){
			System.out.print("[]");
			
			}					//End Recursive interior method
		System.out.println();

		printTriangleRecursive(sideLength-1);

		
								//End Recursive exterior method
	}							//End Method


}//End class