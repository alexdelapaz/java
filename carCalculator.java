/**	Alex de la Paz	


*/

import java.io.PrintStream;
import java.util.Scanner;


public class carCalculator{
  public carCalculator() {}
  
  public static void main(String[] paramArrayOfString){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter the name of a car: ");
    String car1 = keyboard.nextLine();
    
    System.out.print("Enter car's price: ");
    double car1Price = keyboard.nextDouble();
    
    System.out.print("Enter the name of another car: ");
    keyboard.nextLine();
    String car2 = keyboard.nextLine();
    
    System.out.print("Enter car's price: ");
    double car2Price = keyboard.nextDouble();
    
    System.out.println();
    
    String cheaperCar = "";
    if (car1Price > car2Price){
      cheaperCar = car2;
    }
    else{
      cheaperCar = car1;
    }

     System.out.print(cheaperCar + " is the more affordable option.");
	
  }//End class
}//End main method