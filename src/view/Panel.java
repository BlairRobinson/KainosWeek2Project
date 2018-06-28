package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Middle.Employee;

public class Panel extends JPanel {
	
	Employee e;
	
	private JLabel body;

	public Panel(Employee e) {
		this.e = e;
		
		JButton button = new JButton("Employees");
		button.setActionCommand("Employees");
		
		button.addActionListener(new ButtonClickListener());
		
		add(button);
		
		body = new JLabel("", JLabel.CENTER);
		
		add(body);
		
		setLayout(new FlowLayout());
	}

	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			if(ev.getActionCommand().equals("Employees")) {
				System.out.println(e.getName());
				body.setText(e.getName());
			}
		}
	}
}
