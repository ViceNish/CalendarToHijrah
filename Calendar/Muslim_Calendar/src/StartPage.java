import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton btn;
	
	public StartPage() {
		frame=new JFrame();
		panel=new JPanel();
		btn=new JButton("Let's Get Started");
		label=new JLabel("Assalamualaikum and Hi");
		
		
		panel.setLayout(new FlowLayout());
		//, BorderLayout.CENTER);
		panel.add(label);//, BorderLayout.NORTH);
		panel.add(btn);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Calendar Converter");
		frame.setSize(265, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	

}
