package view;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import Middle.Employee;
import java.util.ArrayList;
import Middle.Department;

public class Frame extends JFrame{
	
	DepartmentReport dReport;
	Panel panel;
	NetPayReport nReport;
	
	public Frame(ArrayList<Department> d,ArrayList<Employee> e) {
		panel = new Panel(this);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		add(panel);
		
		dReport = new DepartmentReport(d);
		nReport = new NetPayReport(e);
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void switchToDReport() {
		panel.setVisible(false);
		add(dReport);
	}
	public void switchToNReport() {
		add(nReport);
		
		panel.setVisible(false);
		nReport.setVisible(true);
	}
}
