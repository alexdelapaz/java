public class ClassExampleMethods{

	private String stringOne;
	private int numOne;
	private int numTwo;
	private static int numObjects;

	public ClassExampleMethods(String stringOne, int numOne, int numTwo){
	this.stringOne=stringOne;
	this.numOne=numOne;
	this.numTwo=numTwo;
	numObjects++;
	}

	public ClassExampleMethods(){
	this("",0,0);
	// numObjects++;		//Don't include static variable - it is called in the this() reference.
	}
	
	public String getStringOne(){
	return stringOne;
	}

	public int getnumOne(){
	return numOne;
	}

	public int getnumTwo(){
	return numTwo;
	}

	public boolean areObjectsEqual(ClassExampleMethods inputObject){		//Pass object into a method.
	return this.stringOne.equalsIgnoreCase(inputObject.getStringOne())
	&& this.numOne==inputObject.getnumOne()
	&& this.numTwo==inputObject.getnumTwo();
	}

	public String substringPull(String inString, int startNum, int endNum){
	//String input=inString;
	return inString.substring(startNum,endNum);
	} 

	public String substringPull(String inString, int startNum){
	return inString.substring(startNum);
	} 

	public void substringPrint(){
	System.out.println("Substring");
	}

	public static int amountObjects(){
	return numObjects;
	}

}