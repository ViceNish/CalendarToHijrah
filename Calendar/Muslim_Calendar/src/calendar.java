
import java.awt.FlowLayout;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calendar {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	
	public calendar() {

		frame=new JFrame();
		panel=new JPanel();
		
		panel.setLayout(new FlowLayout());
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Calendar Converter");
		frame.setSize(480, 110);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}