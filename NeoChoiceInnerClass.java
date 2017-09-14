import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeoChoiceInnerClass extends JFrame{

	private JButton blueButton;
	private JButton redButton;
	
	private JLabel blueLabel;
	private JLabel redLabel;

	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 600;;

	public NeoChoiceInnerClass(){
	buildChoices();
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}//End constructor

public class BlueButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
	blueLabel.setText("The story ends.");
	}
}//End inner class

public class RedButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
	redLabel.setText("You stay in wonderland, and I show you how deep the rabit hole goes.");
	}
}//End inner class

	private void buildChoices(){

	blueButton = new JButton("Blue");
	ActionListener BlueButtonEar = new BlueButtonListener();
	blueButton.addActionListener(BlueButtonEar);

	redButton = new JButton("Red");
	ActionListener RedButtonEar = new RedButtonListener();
	redButton.addActionListener(RedButtonEar);

	blueLabel = new JLabel("");
	redLabel = new JLabel("");
	JPanel panel = new JPanel();
	panel.add(blueButton);
	panel.add(blueLabel);
	panel.add(redButton);
	panel.add(redLabel);
	add(panel);
	}//End method
	
}//End class