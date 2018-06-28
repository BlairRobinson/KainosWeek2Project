package view;

import javax.swing.JFrame;
import Middle.Employee;
import java.util.ArrayList;
import Middle.Department;

public class Frame extends JFrame{
	
	DepartmentReport dReport;
	Panel panel;
	
	public Frame(ArrayList<Department> d) {
		panel = new Panel(this);
		add(panel);
		
		dReport = new DepartmentReport(d);
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void switchToDReport() {
		remove(panel);
		add(dReport);
	}
}
