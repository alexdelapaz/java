import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BlankJFrameTest extends JFrame{

	public static void main(String[] args){

	JFrame window = new JFrame();
	window.setTitle("A test version of the JFrame");
	window.setSize(300,300);
	
	JButton button1 = new JButton("Blue");
	JButton button2 = new JButton("Red");
	JPanel panel = new JPanel();
	panel.add(button1);
	panel.add(button2);

	window.add(panel);

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	}

}