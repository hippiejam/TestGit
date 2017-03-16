import javax.swing.*;
import java.awt.event.*;
public class HandleEvent extends JFrame implements ActionListener
{

    public HandleEvent()  {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        add(panel);
     //   OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtOK.addActionListener(this);
        jbtCancel.addActionListener(listener2);
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked: "+e.getActionCommand());
    }
    public static void main(String args[]) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(3); //3= EXIT_ON_CLOSE
        frame.setVisible(true);
    }
}