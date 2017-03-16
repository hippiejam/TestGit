import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ComputeListenerClass  implements ActionListener{

	TestFrame tf;
    ComputeListenerClass(TestFrame tmp)   {
		tf=tmp;
	}

    public void actionPerformed(ActionEvent e)    {
        System.out.println("Cancel button clicked: "+e.getActionCommand());
		double us=Double.parseDouble((tf.jtfDS).getText());
		(tf.jtfThai).setText(""+(us*30));
		
    }
	
}