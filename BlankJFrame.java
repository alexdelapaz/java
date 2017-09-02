import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrame{

	public static void main(String[]args){

	final int FRAME_WIDTH = 600;
	final int FRAME_HEIGHT = 600;

	JFrame window = new JFrame();				//Construct new frame
	window.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	window.setTitle("Hello world window");			//Set frame title - can be left blank
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Default close operation to terminate program upon frame close
	window.setVisible(true);


	JButton button = new JButton("Click here");		//Create new button
	JLabel label = new JLabel("This is a button");		//Create new label

	JPanel panel = new JPanel();				//Construct new panel
	panel.add(button);					//A panel groups multiple user interface components(buttons etc) together
	panel.add(label);
	window.add(panel);

	

	}//End main method
}//End class