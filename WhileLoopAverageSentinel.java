/**	Alex de la Paz	


*/

import java.util.Scanner;

public class WhileLoopAverageSentinel {

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	double sum=0;
	double salary=0;
	int counter=0;
	
	System.out.println("Enter salaries(-1 to finish): ");
	salary=keyboard.nextDouble();

	while(salary != -1){					//While Loop Decider (-1 to finish)
	sum+=salary;
	counter++;

	salary=keyboard.nextDouble();
	}
		if(counter>0){					//If-Else Loop (Data> -1) Sentinel
		System.out.println("Salaries: "+counter);
		System.out.println("Sum: "+sum);
		System.out.printf("Salary average: %.2f", (sum/counter));
		}
		else{
		System.out.print("No data");
		}
		
	}//End main method
}//End class