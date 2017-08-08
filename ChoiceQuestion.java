import java.util.ArrayList;
import java.util.Scanner;

public class ChoiceQuestion extends Question{
	
	//Instance variable - added to subclass
	private ArrayList<String> choices;

/**
	Constructs a coice question object with no choices
*/

	public ChoiceQuestion(){
	//super(paramter variable) - constructor of superclass always constucts empy version or must add paramater variable constructor for super() in -first line- if one is desired.
	choices = new ArrayList<String>();
	}
	
	//Mehod added to subclass
	public void addChoice(String choice, boolean correct){
	choices.add(choice);
		if(correct){
		//Convert choices.size() to String
		String choiceString="" +choices.size();
		this.setAnswer(choiceString);
		}
	}
	
	//Method overrides display() method from superclass
	public void display(){
	super.displayQuestion();			//Call method of the superclass - superclass private variables are not accessible to subclass.
		for(int i=0; i<choices.size(); i++){
		int choiceNumber = i +1;
		System.out.println(choiceNumber+": "+choices.get(i));
		}

	}


	}//End subclass