public class ClassExampleMethods{

	private String inString;
	private int startNum;
	private int endNum;

	public ClassExampleMethods(String inString, int startNum, int endNum){
	this.inString=inString;
	this.startNum=startNum;
	this.endNum=endNum;
	}

	public ClassExampleMethods(){
	this("",0,0);
	}

	public String substringPull(String inString, int startNum, int endNum){
	//String input=inString;
	return inString.substring(startNum,endNum);
	} 

	public String substringPull(String inString, int startNum){
	return inString.substring(startNum);
	} 

	public void substringPull(){
	
	System.out.println("Substring");
	}

}