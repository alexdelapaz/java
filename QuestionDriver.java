/**	Alex de la Paz	


*/

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionDriver{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	Question q1 = new Question();
	q1.setText("Who invented the Java programming language?");
	q1.setAnswer("James Gosling");

	q1.displayQuestion();
	System.out.print("Your submission: ");
	String submission = keyboard.nextLine();
	
	if(q1.checkAnswer(submission)){
	System.out.print(q1.checkAnswer(submission)+", "+submission 
	+" is the inventor of Java!");
	}
	else{
	System.out.print(q1.checkAnswer(submission)+", "+submission 
	+" is not the inventor of Java.");
	}

	}//End Main method

/**
	Presents the user question and checks the answer
*/

	public static void presentQuestion(Question q){
	q.display();
	System.out.print(Your submission: ");
	Scanner keyboard = new Scanner(System.in);
	String submission = keyboard.nextLine();
	System.out.println(q.checkAnswer(submission);
	}

}//End class