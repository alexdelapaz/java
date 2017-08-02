/**	Alex de la Paz	


*/

import java.util.Scanner;

public class ClassRockBandTester {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	ClassRockBand huxton = new ClassRockBand();
	
	huxton.addMembers(1);
	huxton.addName("H U X T O N");

	System.out.println(huxton);

	System.out.println(huxton.bandMembers());
	System.out.println(huxton.bandName());

	huxton= new ClassRockBand();
	System.out.println(huxton.bandMembers()+"empty.");
	System.out.println(huxton.bandName()+"empty");

	}//End main method
	
}//End class


