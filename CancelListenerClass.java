import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class CancelListenerClass  implements ActionListener{

    CancelListenerClass()   {  }

    public void actionPerformed(ActionEvent e)    {
        System.out.println("Cancel button clicked: "+e.getActionCommand());
    }
}