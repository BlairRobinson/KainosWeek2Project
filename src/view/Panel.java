package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import DB.DBConnector;

import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Middle.Employee;

public class Panel extends JPanel {
	
	private JLabel body;
	
	protected JTextField fNameField;
	protected JTextField lNameField;
	protected JTextField addressField;
	protected JTextField nINField;
	protected JTextField bNField;
	protected JTextField sCField;
	protected JTextField salaryField;
	protected JTextField empNumField;
	
	Frame frame;

	public Panel(Frame frame) {
		this.frame = frame;
		
		//Gets employee
		JButton button = new JButton("Submit");
		button.setActionCommand("Submit");
		button.addActionListener(new ButtonClickListener());
		
		JButton switchSalesButton = new JButton("Sales Employee");
		switchSalesButton.setActionCommand("employee");
		switchSalesButton.addActionListener(new ButtonClickListener());
		
		
		JButton switchButton = new JButton("Department Report");
		switchButton.setActionCommand("switch");
		switchButton.addActionListener(new ButtonClickListener());
		
		fNameField = new JTextField(20);
		lNameField = new JTextField(20);
		addressField = new JTextField(20);
		nINField = new JTextField(20);
		bNField = new JTextField(20);
		sCField = new JTextField(20);
		salaryField = new JTextField(20);
		empNumField = new JTextField(20);
		
		add(new JLabel("First Name: "));
		add(fNameField);
		add(new JLabel("Last Name: "));
		add(lNameField);
		add(new JLabel("Address: "));
		add(addressField);
		add(new JLabel("National Insurance Number: "));
		add(nINField);
		add(new JLabel("Bank Account Number: "));
		add(bNField);
		add(new JLabel("Sort Code: "));
		add(sCField);
		add(new JLabel("Starting Salary: "));
		add(salaryField);
		add(new JLabel("Employee Number: "));
		add(empNumField);
		
		add(button);
		
		body = new JLabel("", JLabel.CENTER);
		
		add(body);
		add(switchSalesButton);
		add(switchButton);
	}

	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public float floatConvert(String num) {
		try {
			Float number = new Float("10.0f");
			return (float) number.parseFloat(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} 
		return 0;
	}
	
	public class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			if(ev.getActionCommand().equals("Submit")) {
				System.out.println(fNameField.getText());
				Employee e = new Employee(
						fNameField.getText(), 
						lNameField.getText(),
						addressField.getText(), 
						nINField.getText(),
						bNField.getText(),
						sCField.getText(),
						floatConvert(salaryField.getText()),
						1,
						Integer.parseInt(empNumField.getText())
						);
				
				System.out.println("Submitted");
				
				DBConnector.addEmployee(e);
				/*
				protected JTextField nameField;
				protected JTextField addressField;
				protected JTextField nINField;
				protected JTextField bNField;
				protected JTextField sCField;
				protected JTextField salaryField; //float
				protected JTextField empNumField; //int
				*/
			}
			if(ev.getActionCommand().equals("switch")) {
				frame.switchToDReport();
			}
			if(ev.getActionCommand().equals("employee")) {
				frame.switchToSales();
			}
		}
	}
}
