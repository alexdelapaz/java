import java.util.Scanner;

public class BlankInstanceOfObject{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	
	Question questionOne = new Question();
	
	Question questionTwo = new Question();
	

	Question q1 = questionOne;	//Legal Superclass <- Subclass
	
	if (questionTwo instanceof ChoiceQuestion){
	Question q2 = (Question) questionTwo;
	}
	
	}//End main method

	/** SUPERCLASS EQUALS METHOD						//Method used to override and compare the state(implicit paramaters) of classes
	public boolean equals(Object otherObject){	

	if (otherObject == null) { 
	return false; 
	}
 	if (getClass() != otherObject.getClass()) { 
	return false; 
	}
	else{
 	Questionother = (Question) otherObject;
 	return color.equals(other.color) && value == other.value;
	}
	}//End method

	SUBCLASS EQUALS METHOD
 	public boolean equals(Object otherObject){
 	
	if (!super.equals(otherObject)) { 		//Call super equals() method first
	return false; 
	}
	
 	ChoiceQuestion other = (ChoiceQuestion) otherObject;
	return text == other.text;
 	}
	}//End method
	*/
}//End Cosmic Super Class