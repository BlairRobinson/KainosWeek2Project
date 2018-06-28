package view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DB.DBConnector;
import Middle.Employee;
import Middle.salesEmployee;
import view.Panel.ButtonClickListener;

public class SalesEmployee extends JPanel {
private JLabel body;
	
	protected JTextField fNameField;
	protected JTextField lNameField;
	protected JTextField addressField;
	protected JTextField nINField;
	protected JTextField bNField;
	protected JTextField sCField;
	protected JTextField salaryField;
	protected JTextField empNumField;
	protected JTextField totalSalesField;
	protected JTextField commissionRate;
	
	Frame frame;
	
	public SalesEmployee(Frame f) {
		
		//Gets employee
		JButton button = new JButton("Submit");
		button.setActionCommand("Submit");
		button.addActionListener(new ButtonClickListener());
		
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
		totalSalesField = new JTextField(20);
		commissionRate = new JTextField(20);
		
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
		add(new JLabel("Total Sales: "));
		add(totalSalesField);
		add(new JLabel("Commission: "));
		add(commissionRate);
		
		
		add(button);
		
		body = new JLabel("", JLabel.CENTER);
		
		add(body);
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
				salesEmployee e = new salesEmployee(
						fNameField.getText(), 
						lNameField.getText(),
						addressField.getText(), 
						nINField.getText(),
						bNField.getText(),
						sCField.getText(),
						floatConvert(salaryField.getText()),
						1,
						0,
						floatConvert(commissionRate.getText()),
						floatConvert(totalSalesField.getText())
						);
				
				System.out.println("Submitted Sales Employee");
				
				DBConnector.addSalesEmployee(e);
				DBConnector.addToSales(e);
				
				fNameField.setText("");
				lNameField.setText("");
				addressField.setText("");
				nINField.setText("");
				bNField.setText("");
				sCField.setText("");
				salaryField.setText("");
				totalSalesField.setText("");
				commissionRate.setText("");
				
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
		}
	}
}

