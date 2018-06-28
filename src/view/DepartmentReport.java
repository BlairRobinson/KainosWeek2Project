package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Middle.Employee;
import view.Panel.ButtonClickListener;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.ArrayList;
import Middle.Department;

public class DepartmentReport extends JPanel{
	
	JTextField depNumField;
	JButton button;
	JLabel body;
	JLabel label;
	
	ArrayList<Department> d;
	
	Frame frame;
	
	public DepartmentReport(ArrayList<Department> d, Frame f) {
		frame = f;
		
		button = new JButton("Get department");
		button.setActionCommand("Submit");
		button.addActionListener(new ButtonClickListener());
		
		JButton switchEmployeeButton = new JButton("None Sales Employee");
		switchEmployeeButton.setActionCommand("employee2");
		switchEmployeeButton.addActionListener(new ButtonClickListener());
		
		JButton switchSalesButton = new JButton("Sales Employee");
		switchSalesButton.setActionCommand("employee");
		switchSalesButton.addActionListener(new ButtonClickListener());
		
		label = new JLabel("Enter Department");
		
		depNumField = new JTextField(10);
		
		body = new JLabel("");
		
		
		add(label);
		add(depNumField);
		add(button);
		add(body);
		
		add(switchEmployeeButton);
		add(switchSalesButton);
		
		this.d = d;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			if(ev.getActionCommand().equals("Submit")) {
				int depNum = Integer.parseInt(depNumField.getText()) - 1;
				
				String text = "<html>";
				
				text += "The employee in Department " + d.get(depNum).getName() + " <br />";
				
				for(int i = 0; i < d.get(depNum).getEmployees().size(); i++) {
					Employee e = d.get(depNum).getEmployees().get(i);
					
					text += e.getFname() + " " + e.getLname() + " <br />";
				}
				
				text += "</html>";
				
				body.setText(text);
			}
			if(ev.getActionCommand().equals("employee2")) {
				frame.switchToEmployee();
			}
			if(ev.getActionCommand().equals("employee")) {
				frame.switchToSales();
			}
		}
	}
}
