/**	Alex de la Paz	


*/

import java.util.Scanner;

public class nestedLoopPrint {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	for(int i=1; i<=5; i++){
	System.out.print("\nRow: " + i + " ");

		for(int j=1; j<=10; j++){
		System.out.print("|Column:" + j + "|");
		}
	}

	

	}//End main method
}//End class