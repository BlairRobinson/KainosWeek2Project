package view;

import javax.swing.JPanel;

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
	
	JButton button;
	JLabel body;
	
	ArrayList<Department> d;
	
	public DepartmentReport(ArrayList<Department> d) {
		button = new JButton("Get department");
		button.setActionCommand("Submit");
		button.addActionListener(new ButtonClickListener());
		
		body = new JLabel("");
		
		this.d = d;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			if(ev.getActionCommand().equals("Submit")) {
				
			}
		}
	}
}
