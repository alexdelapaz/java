/**	Alex de la Paz	
	A class that simulates a data set of a rock band's name
	and amount of members in the band.
*/
public class ClassExample{
	
	private int members;
	private String name;

/**
	Constructs a rock band taking user input for member amount and name.
*/
	public ClassExample(int members, String name){
	this.members=members;
	this.name=name;	
	}

/**	Constructs a rock band with cleared member count and name.

	public ClassExample(){			//Complicated way - Method call
	clear();
	}//End Constructor

	public ClassExample(){			//Complicated way - Assignment
	members = 0;
	name =  "";
	}//End Constructor
*/

	public ClassExample(){			// this - Constructor method is more simple
	this(0,"");
	}

/**	Adds member count to the band.
	@param members the amount of band members.
*/
	public void addMembers(int inputMembers){
	members+=inputMembers;
	}

/**	Adds a name for the band.
	@param name the name of the band.
*/
	public void addName(String addName){
	name=addName;
	}

/**	Gets the amount of band members.
	@return the amount of band members.
*/
	public int addBandMembers(int members){		//Accessor/Getter does not modify instance variable.
	this.members=members;
	return members;
	}
	public int bandMembers(){
	return members;
	}

/**	Gets the band name.
	@return the band name.
*/
	public String bandName(){
	return name;
	}

/**	Clears the band name and the amount of band members.
*/
	public void clear(){
	members=0;
	name="";
	}

/**
	Class private method to print a phrase.
*/
	private void privatePrint(){
	System.out.println("Rock and roll lives!!!!");
	}

/**
	Class public method to print a phrase.
*/
	public String publicPrint(){
	privatePrint();				//calls privatePrint(); method
	return "Forever!";
	}

/**
	Class public static method to print a phrase.
*/
	public static String publicStaticPrint(){
	// privatePrint();			//ERROR- calls privatePrint(); method
	return "ForeverEva!";
	}

/**
	ClassRockBand toString method.
*/
	public String toString(){
	String result = "toString: \nMembers: "+ this.members + 
	"\nBand name: " + this.name;
	return result;
	}

	
}//End Class


