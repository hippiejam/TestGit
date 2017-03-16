import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class OKListenerClass  implements ActionListener
{

    OKListenerClass(){ }

    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked: "+e.getActionCommand());
    }
}