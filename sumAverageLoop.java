/**	Alex de la Paz	


*/

import java.util.Scanner;

public class sumAverageLoop {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Please enter numbers to add together and average their sum.(Q to quit)");
	
	double total=0;
	int count=0;

	while(keyboard.hasNextDouble()){
	double input = keyboard.nextDouble();
	total+=input;
	count++;
	}

	double average=0;
	if(count>0){
	average=total/count;
	System.out.print("The average of the number entered is: " + average);
	}
	else{
	System.out.print("Data not valid");
	}

	

	}//End main method
}//End class