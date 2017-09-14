import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlankJFrameTest{

	public static void main(String[] args){

	JFrame window = new JFrame();
	window.setTitle("Your choice NEO");
	window.setSize(300,300);
	
	JButton button1 = new JButton("Blue");
	JButton button2 = new JButton("Red");

	JPanel panel = new JPanel();
	panel.add(button1);
	panel.add(button2);

	window.add(panel);
								//Construct BlankClickListener subclass from superclass of ActionListener
	ActionListener listenerBlue = new BlueClickListener();	
	button1.addActionListener(listenerBlue);			//Add listener to button
	
	ActionListener listenerRed = new RedClickListener();
	button2.addActionListener(listenerRed);

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	}

}