
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class calendar{// implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label,label2,label3;
	private JTextField daytxt,monthtxt,yeartxt;
	private JButton btn;
	//Scanner lc=new Scanner(System.in);
	
	//String inday;
	
	public calendar() {

		frame=new JFrame();
		panel=new JPanel();
		label=new JLabel("Day");
		label2=new JLabel("Month");
		label3=new JLabel("Year");
		daytxt=new JTextField(3);
		monthtxt=new JTextField(3);
		yeartxt=new JTextField(3);
		
		
		btn=new JButton("Output");
		btn.addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e) {
	        	String daytext = daytxt.getText();
	        	//int dayint=Integer.parseInt(daytext);
	        	
	            
	            String monthtext = monthtxt.getText();
	            String yeartext = yeartxt.getText();
	            if(daytext.equals("") || monthtext.equals("") || yeartext.equals("")) {
	            	 JOptionPane.showMessageDialog(null, "Please insert date","Error",JOptionPane.ERROR_MESSAGE);
	            }else {
	            	JOptionPane.showMessageDialog(null, daytext + " / " + monthtext + " / " + yeartext, "Your date", JOptionPane.INFORMATION_MESSAGE);
	            }
	            
	        }
	    });
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(daytxt);
		panel.add(label2);
		panel.add(monthtxt);
		panel.add(label3);
		panel.add(yeartxt);
		
		panel.add(btn);
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Calendar Converter");
		frame.setSize(480, 110);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}



	/*@Override
	public void actionPerformed(ActionEvent arg0) {
		String inday = daytxt.getText();   //receive input from text field
        System.out.println(inday);
		
	}*/

}

