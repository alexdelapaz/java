import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrameSubClassDriverCombine extends JFrame{

	public static void main(String[] args){

	JFrame window = new BlankJFrame();
	window.setTitle("A subclass version of the JFrame");

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	}//End main method

	public JButton button;				//Declare components as instance variables
	public JLabel label;

	public static final int FRAME_WIDTH = 300;
	public static final int FRAME_HEIGHT = 100;


	public class BlankJFrame(){

	createComponents();				//Private helper method

	setSize(FRAME_WIDTH, FRAME_HEIGHT);		//Use Super defined method to set width and heigh in the constructor

	}//End constuctor


	public void createComponents(){
	button = new JButton("Click me");		//Instantiate components
	label = new JLabel("This is a button");
	JPanel panel = new JPanel();
	panel.add(button);
	panel.add(label);
	add(panel);
	}

}