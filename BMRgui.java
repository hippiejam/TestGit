/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

/**
 *
 * @author TanGX
 */
public class BMRgui extends JFrame implements ActionListener{
    
  JButton nextBtn;
  JButton calculateBtn;
  JLabel lblWidth;
  JLabel lblHeight;
  JLabel lblAge;
  JLabel lblTitle;
  JLabel lblGen;   
  JLabel lblFree;
  JTextField txtWidth;
  JTextField txtHeight;
  JTextField txtAge;
  JRadioButton jchkMale;
  JRadioButton jchkFemale;
  
  public  BMRgui() {
    nextBtn = new JButton("NEXT");
    calculateBtn = new JButton("CALCULATE");
    //ตัวเลข = ความยาวเท่าไหร่ , ตัวหนังสือ = ค่า default
    txtWidth=new JTextField(1);
    txtHeight=new JTextField(1);
    txtAge=new JTextField(1);
    
    lblTitle=new JLabel("STEP1: BMR");
    lblGen=new JLabel("Gender ");
    lblWidth=new JLabel("Width(KG) ");
    lblHeight=new JLabel("Height(CM) ");
    lblAge=new JLabel("Age(YEARS) ");
    lblFree=new JLabel(" ");
    
    jchkMale = new JRadioButton("Male");
    jchkFemale = new JRadioButton("Female");
    ButtonGroup group = new ButtonGroup();
    group.add(jchkMale);
    group.add(jchkFemale);
    //หัวเรื่อง
    setTitle("BMR (create new user)");
    JPanel pn = new JPanel(new GridLayout(5,2));
    pn.add(lblGen);
    pn.add(jchkMale);
    pn.add(lblFree);
    pn.add(jchkFemale);
    pn.add(lblWidth);
    pn.add(txtWidth);
    pn.add(lblHeight);
    pn.add(txtHeight);
    pn.add(lblAge);
    pn.add(txtAge);
    pn.setBorder(new TitledBorder("STEP1: BMR"));
    JPanel pn2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    pn2.add(nextBtn);
    
    getContentPane().add(pn,BorderLayout.CENTER);
    getContentPane().add(pn2,BorderLayout.SOUTH);
    
    nextBtn.addActionListener(this);

  }

    public void actionPerformed(ActionEvent e) {
        JPanel next = new JPanel(new BorderLayout());
        next.add(new JButton("test"));
        getContentPane().removeAll();
        getContentPane().add(next);//Adding to content pane, not to Frame
        repaint();
        printAll(getGraphics());
    }
    
    public static void main(String[] args) {
    BMRgui frame = new BMRgui();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.pack();
  } 
}
