import java.util.Scanner;

public class Question{

	private String text;
	private String answer;

/**
	Constructs a question object with
	empty question and answer text.
*/
	public Question(){
	text="";
	answer="";
	}

/**
	Sets question
	@param questionText the text of question.
*/
	public void setText(String questionText){
	text=questionText;
	}

/**
	Sets answer
	@param answerText the correct answer of question.
*/
	public void setAnswer(String answerText){
	answer=answerText;
	}

/**
	Checks submission
	@param submission the submission answer of question.
*/
	public boolean checkAnswer(String submission){
	return submission.equalsIgnoreCase(answer);
	}

/**
	Displays question
*/
	public void displayQuestion(){
	System.out.println(text);
	}

/**
	Presents the user question and checks the answer
*/

	public void presentQuestion(){
	displayQuestion();
	System.out.print("Your submission: ");
	Scanner keyboard = new Scanner(System.in);
	String submission = keyboard.nextLine();
	System.out.println(checkAnswer(submission));
	}
}//End class