/**	Alex de la Paz	


*/

import java.util.Scanner;

public class MethodFun {

public static double AgeSquared(double age){			//METHOD AgeSquared();
	double ageSquared = age*age;
	return ageSquared;
	}


	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter age: ");
	double ageCalc = keyboard.nextDouble();
	double ageX2 = AgeSquared(ageCalc);
	System.out.print("Age squared is: "+ageX2);
	

	}//End main method
}//End class