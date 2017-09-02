import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrameSubClass extends JFrame{

	private JButton button;				//Declare components as instance variables
	private JLabel label;

	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;


	public BlankJFrameSubClass(){

	createComponents();				//Private helper method

	setSize(FRAME_WIDTH, FRAME_HEIGHT);		//Use Super defined method to set width and heigh in the constructor

	}//End constuctor


	private void createComponents(){
	button = new JButton("Click me");		//Instantiate components
	label = new JLabel("This is a button");
	JPanel panel = new JPanel();
	panel.add(button);
	panel.add(label);
	add(panel);
	}



}