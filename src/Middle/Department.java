package Middle;

import java.util.ArrayList;

public class Department {

	protected String name;

	protected ArrayList<Employee> employees;

	public Department() {
		employees = new ArrayList<>();
	}

	public Department(String name) {
		this();
		this.name = name;
	}

	public Department(String name, ArrayList<Employee> employees) {
		this(name);
		this.name = name;
		this.employees = employees;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public String getName() {
		return name;
	}

	public void addEmployee(Employee newEmployee) {
		employees.add(newEmployee);
	}

	public void setName(String newName) {
		name = newName;
	}
}
