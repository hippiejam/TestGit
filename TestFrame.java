import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TestFrame {//implements ActionListener{
    
	JFrame jf;
	JTextField jtfThai;
	JTextField jtfDS;
	
	
	TestFrame(){
		jf=new JFrame("Convert Money");
		
		
		jtfThai =new JTextField();
		jtfDS =new JTextField();
		
		JPanel jpn1=new JPanel(new GridLayout(2,2));
		
		jpn1.add(new JLabel("US Dollar"));
		jpn1.add (jtfDS);
		jpn1.add(new JLabel("Thai Baht"));
		jpn1.add (jtfThai);
		
		JButton jbtCompute=new JButton("Compute");
		
		JPanel jpn2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jpn2.add(jbtCompute);
		
		jf.setSize(200,100);
		
		jf.add(jpn1,BorderLayout.CENTER);
		jf.add(jpn2,BorderLayout.SOUTH);
		
		ComputeListenerClass lis=new ComputeListenerClass(this);
		
		jbtCompute.addActionListener(lis);
		
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*public void actionPerformed(ActionEvent e){
	    double us=Double.parseDouble(jtfDS.getText());
		jtfThai.setText(""+(us*30));
		
	}*/
	
	
	public static void main(String args[]){
	
		TestFrame tf=new TestFrame();
		
		
		
	
	
	
	}
}