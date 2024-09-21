package com.awt.program;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AwtProgram implements ActionListener {
	
	Frame frame;
	TextField field,field2,field3;
	Label label, label2, label3;
	Button button, button2;
	
  public AwtProgram() {
 frame= new Frame("Awt_App");
 frame.setSize(450,500);
 frame.setBackground(Color.CYAN);
 
 label = new Label("Enter the first Number");
 label2 = new Label("Enter the second Number");
 label3 = new Label("Result");
 
 button = new Button("Addition");
 button2 = new Button("Substraction");
 
 FlowLayout flowLayout = new FlowLayout();
 frame.setLayout(flowLayout);
 
 field = new TextField(10);
 field2 = new TextField(10);
 field3 = new TextField(10);
 
 
 
 frame.add(label);
 frame.add(field);
 frame.add(label2);
 frame.add(field2);
 frame.add(label3);
 frame.add(field3);
 frame.add(button);
 frame.add(button2);
 frame.setVisible(true);
 
 button.addActionListener(this);
 button2.addActionListener(this);
 
 
 
 
	  
}
	public static void main(String[] args) {
		AwtProgram awtProgram = new AwtProgram();
	
  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String num=field.getText();
		String num2= field2.getText();
		
		if(num.isEmpty() || num2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please fill the blank ....");
		}
		else
		{
			Double db= Double.parseDouble(num);
			Double db1= Double.parseDouble(num2);
			
			Object object = e.getSource();
			if(object ==button)
			{
				field3.setText("Sum ="+(db+db1));
			}else
			{
				field3.setText("sub ="+(db-db1));
			}
			
		}
	}

}
