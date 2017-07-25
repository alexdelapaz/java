
import java.util.Scanner;


public class switchFun { 

	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);

	int count=0;	

	System.out.println("Please select A, B, C, or D");
	char option=keyboard.next().charAt(0);
	
	switch(option){

	case 'A':
	case 'a':		//To get both 'UPPER' and 'lower' case: skip break: statement
		count++;
		break;
	case 'B':
		count++;
		break;
	case 'C':
		count++;
		break;
	case 'D':
		count++;
		break;
	
	default:
		System.out.print("Not a valid option");
	}


	System.out.print("\nOption Count is " + count);
	


	}//End main method
}//End class