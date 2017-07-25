/**	Alex de la Paz	


*/

import java.util.Scanner;

public class nestedLoopPrintAscend {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	for(int i=1; i<=5; i++){
	System.out.print("\nRow: " + i + " ");

		for(int j=1; j<=i; j++){
		System.out.print("|Column:" + j + "|");
		}
	}

	

	}//End main method
}//End class