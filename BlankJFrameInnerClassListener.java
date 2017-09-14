import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlankJFrameInnerClassListener extends JFrame{

	private JButton button;					//Declare components as instance variables
	private JLabel label;

	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;


	public BlankJFrameInnerClassListener(){
	createComponents();					//Private helper method
	setSize(FRAME_WIDTH, FRAME_HEIGHT);			//Use Super defined method to set width and heigh in the constructor

	}//End constuctor


//Inner Class
	public class BlankClickListener implements ActionListener{	
	public void actionPerformed(ActionEvent event){		//Public method to listen for event and peform action
	label.setText("Click successfull!");			//The implementation of the action performed
	}//End method

	}//End inner class

	private void createComponents(){
	button = new JButton("Button");			//Instantiate components
	ActionListener listener = new BlankClickListener();
	button.addActionListener(listener);

	label = new JLabel("Click this button");
	JPanel panel = new JPanel();
	panel.add(button);
	panel.add(label);
	add(panel);
	}//End method

}//End class