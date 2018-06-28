package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Middle.Employee;

public class NetPayReport extends JPanel{
	
	ArrayList<Employee> d = new ArrayList<Employee>();
	
	JLabel body;

	public NetPayReport(ArrayList<Employee> d) {
		// TODO Auto-generated constructor stub
		
		body = new JLabel("");
		
		this.d = d;
		
		String text = "<html>";
		
		text += "List of employees with net pay. <br />";
		
		for(int i = 0; i < d.size(); i++) {
			Employee e = d.get(i);
			
			text += e.getFname() + " " + e.getNetPay() + " <br />";
		}
		
		text += "</html>";
		
		body.setText(text);
		add(body);
	}
	

}
