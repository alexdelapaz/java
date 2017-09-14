import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrameInnerClassListenerDriver{

	public static void main(String[]args){

	
	JFrame window = new BlankJFrameInnerClassListener();
	window.setTitle("A subclass version of the JFrame");

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	}//End main method
}//End class