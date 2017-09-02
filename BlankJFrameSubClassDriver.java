import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrameSubClassDriver extends JFrame{

	public static void main(String[] args){

	JFrame window = new BlankJFrameSubClass();
	window.setTitle("A subclass version of the JFrame");

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	}

}