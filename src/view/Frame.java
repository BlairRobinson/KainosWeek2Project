package view;

import javax.swing.JFrame;
import Middle.Employee;

public class Frame extends JFrame{
	
	Employee e;
	
	public Frame(Employee e) {
		add(new Panel(e));
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.e = e;
	}
	
	
}
