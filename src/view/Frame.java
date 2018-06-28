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

	SalesEmployee employee;

	
	public Frame(ArrayList<Department> d,ArrayList<Employee> e) {
		panel = new Panel(this);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		add(panel);
		

		dReport = new DepartmentReport(d);
		nReport = new NetPayReport(e);

		employee = new SalesEmployee(this);
		employee.setLayout(new BoxLayout(employee, BoxLayout.PAGE_AXIS));
		
		dReport = new DepartmentReport(d, this);

		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void switchToEmployee() {
		add(panel);
		
		employee.setVisible(false);
		dReport.setVisible(false);
		panel.setVisible(true);
	}
	
	public void switchToDReport() {
		add(dReport);
		
		panel.setVisible(false);
		employee.setVisible(false);
		dReport.setVisible(true);
	}
	
	public void switchToSales() {
		add(employee);
		
		panel.setVisible(false);
		employee.setVisible(true);
		dReport.setVisible(false);
	}
	public void switchToNReport() {
		add(nReport);
		
		panel.setVisible(false);
		nReport.setVisible(true);
	}
}
