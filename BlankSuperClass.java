import java.util.Scanner;

 public class BlankSuperClass{

	private String text;
	private String moreText;

/**
	Constructs a BlankSuperClass object
	with empty text and moreText Strings.
*/
	public BlankSuperClass(){		//When subclass constructor called
	text="";				//BlankSuperClass() blank constructor is automatically called
	moreText="";				//Unless super(); is called with explicit parameters
	}

/**
	Sets text
	@param text sets the text String
*/
	public void setText(String text){
	this.text=text;
	}

/**
	Sets moreText
	@param text sets the moreText String
*/
	public void setMoreText(String moreText){
	this.text=moreText;
	}

/**
	Displays text
*/
	public void displayText(){
	System.out.println(text);
	}

/**
	Checks submission
	@param submission the String text is equal to moreText
*/
	public boolean checkAnswer(String submission){
	return submission.equalsIgnoreCase(text);
	}

/**
	Presents the user text and checks if equal to moreText
*/

	public void presentTextCompare(){
	displayText();
	System.out.print("Origional text: ");
	Scanner keyboard = new Scanner(System.in);
	String submission = keyboard.nextLine();
	System.out.println(checkAnswer(submission));
	}

/**
	Constructs a toString method
	@return a String with the Object name and state
*/
	public String toString(){
	return getClass().getName()+"\nText: "+text+"\nMore text: "+moreText;
	}
		//getClass().getName() returns class object data type name

}//End class