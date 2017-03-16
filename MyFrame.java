import javax.swing.*;
import java.awt.*;
public class MyFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyFrame"); // Create a frame
	JTextField jtf=new JTextField("AA",2);

	frame.add(jtf, BorderLayout.WEST);
	
        frame.setSize(200, 100); // Set the frame size (width, height)
        frame.setLocationRelativeTo(null); // New since JDK 1.4
  	frame.setVisible(true); // Display the frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
