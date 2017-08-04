/**	Alex de la Paz	


*/

import java.util.Scanner;

public class ClassExampleMethodsDriver {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	ClassExampleMethods Object1 = new ClassExampleMethods("Hello",1,2);
	
	ClassExampleMethods Object2 = new ClassExampleMethods();

	
	//System.out.println(Object1.areObjectsEqual(Object2));		//Object passed into method.


	//ClassExampleMethods Object3 = new ClassExampleMethods();


	//Object1.substringPrint();
	
	System.out.println(ClassExampleMethods.amountObjects());

	}//End main method
	
}//End class


