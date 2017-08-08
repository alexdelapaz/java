/**	Alex de la Paz	


*/

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionPolymorphicDriver{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	Question q1 = new Question();
	q1.setText("Who invented the Java programming language?");
	q1.setAnswer("James Gosling");

	ChoiceQuestion q2 = new ChoiceQuestion();
	q2.setText("What country was the inventor of Java born?");
	q2.addChoice("Canada",true);
	q2.addChoice("Denmark",false);
	q2.addChoice("America",false);
	q2.addChoice("Australia",false);

	q1.presentQuestion();	//Call Question class
	q2.presentQuestion();	//Call subclass ChoiceQuestion
	
	}//End main method


	//presentQuestion()Method conained in Question class now - old/ChoiceQuestionDriver
/**

	Presents the user question and checks the answer


	public static void presentQuestion(Question q){
	q.displayQuestion();
	System.out.print("Your submission: ");
	Scanner keyboard = new Scanner(System.in);
	String submission = keyboard.nextLine();
	System.out.println(q.checkAnswer(submission));
	}
*/

}//End class