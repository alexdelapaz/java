/**	Alex de la Paz	


*/

import java.util.Scanner;

public class ClassRockBandTester {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	ClassRockBand huxton = new ClassRockBand();
	
	huxton.addMembers(1);				//Void method adds members and updates instance variable.
	huxton.addMembers(1);
	System.out.println(huxton.bandMembers());

	huxton.addBandMembers(1); 			//Accessor/Getter does not modify instance variable.
	System.out.println(huxton.bandMembers());	//Sets to 1
	huxton.addBandMembers(2);		
	System.out.println(huxton.bandMembers());	//Now set to 2 - edited this.members and accessed within call but not object variable.		
	huxton.addName("H U X T O N");

	System.out.println(huxton);			// toString(); is same as calling object reference name(if toString not explicitly created).
	System.out.println(huxton.toString());

	System.out.println(huxton.bandMembers());
	System.out.println(huxton.bandName());

	huxton= new ClassRockBand();			//Constructor clears variables.
	System.out.println(huxton.bandMembers()+"empty.");
	System.out.println(huxton.bandName()+"empty");

	// ERROR - huxton.privatePrint();		//Instance Object String method - private method
	System.out.println(huxton.publicPrint());	//Instance Object String method - Public method(calls private method)
	System.out.println(ClassRockBand.publicStaticPrint());//CLASS METHOD STATIC to print String

	}//End main method
	
}//End class


