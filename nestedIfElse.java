/**	Alex de la Paz	

	Minimum of three values, nested If.
*/

import java.util.Scanner;

public class nestedIfElse {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter three numbers:");
	int num1=keyboard.nextInt();
	int num2=keyboard.nextInt();
	int num3=keyboard.nextInt();

	int minimum=0;

	if(num1<num2){
		if(num1<num3){
		minimum=num1;
		}
		else{
		minimum=num3;
		}
	}
	else{
		if(num2<num3){
		minimum=num2;
		}
		else{
		minimum=num3;
		}
	}
	System.out.print("The minimum of the three values: " + minimum);

	
	}//End main method
}//End class