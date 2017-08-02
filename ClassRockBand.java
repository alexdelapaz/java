/**	Alex de la Paz	
	A class that simulates a data set of a rock band's name
	and amount of members in the band.
*/
public class ClassRockBand{
	
	private int members;
	private String name;

/**
	Constructs a rock band taking user input for member amount and name.
*/
	public ClassRockBand(int members, String name){
	this.members=members;
	this.name=name;	
	}

/**	Constructs a rock band with cleared member count and name.

	public ClassRockBand(){			//Complicated way - Method call
	clear();
	}//End Constructor

	public ClassRockBand(){			//Complicated way - Assignment
	members = 0;
	name =  "";
	}//End Constructor
*/

	public ClassRockBand(){			// this - Constructor method is more simple
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
	
}//End Class


