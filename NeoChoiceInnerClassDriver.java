import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NeoChoiceInnerClassDriver{

	public static void main(String[]args){

	JFrame neoChoice = new NeoChoiceInnerClass();
	neoChoice.setTitle("You decide.");
	
	neoChoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	neoChoice.setVisible(true);

	}//End main method
}//End class