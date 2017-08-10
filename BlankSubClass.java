import java.util.ArrayList;
import java.util.Scanner;

public class BlankSubClass extends BlankSuperClass{
	
	//Instance variable - added to subclass
	private ArrayList<String> choices;

/**
	Constructs a BlankSubClass object
*/

	public BlankSubClass(){
	//super(paramter variable) - constructor of superclass always constucts empy version or must add paramater variable constructor for super() in -first line- if one is desired.
	choices = new ArrayList<String>();
	}
	
	//Mehod added to subclass
	public void addChoice(String choice, boolean correct){
	choices.add(choice);
		if(correct){
		//Convert choices.size() to String
		String choiceString="" +choices.size();
		this.setText(choiceString);
		}
	}
	
	//Method overrides displayText() method from superclass
	public void displayText(){
	super.displayText();			//Call method of the superclass - superclass private variables are not accessible to subclass.
		for(int i=0; i<choices.size(); i++){
		int choiceNumber = i +1;
		System.out.println(choiceNumber+": "+choices.get(i));
		}

	}


	}//End subclass