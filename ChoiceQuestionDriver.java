/**	Alex de la Paz	


*/

import java.util.ArrayList;
import java.util.Scanner;

public class ChoiceQuestionDriver{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	ChoiceQuestion q1 = new ChoiceQuestion();
	q1.setText("What was the Java languages origional name?");
	q1.addChoice("Python",false);
	q1.addChoice("Oak",true);
	q1.addChoice("C++",false);
	q1.addChoice("Kotlin",false);

	ChoiceQuestion q2 = new ChoiceQuestion();
	q2.setText("What country was the inventor of Java born?");
	q2.addChoice("Canada",true);
	q2.addChoice("Denmark",false);
	q2.addChoice("America",false);
	q2.addChoice("Australia",false);

	presentQuestion(q1);	
	presentQuestion(q2);


	}//End Main method

	//presentQuestion()Method conained as static in class

/**
	Presents user question and checks answer
	@param q the question
*/

	public static void presentQuestion(ChoiceQuestion q){
	q.displayQuestion();
	System.out.print("Your submission: ");
	Scanner keyboard = new Scanner(System.in);
	String submission = keyboard.nextLine();
	System.out.println(q.checkAnswer(submission));
	}


}//End class