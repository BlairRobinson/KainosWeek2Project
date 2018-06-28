import java.util.ArrayList;

import Middle.Department;
import Middle.Employee;
import view.Frame;

public class EmployeeProject {

	public EmployeeProject() {
		Employee e = new Employee("Name", "Address", "12345678C", "01928384", "237845", 28000f, 10);
		
		Department d = new Department("Test Department");
		d.addEmployee(e);
		
		System.out.println(d.getEmployees());
	}
	
	public static void main(String args[]) {
		new EmployeeProject();
		ArrayList<Employee> bigEmps = DBConnector.getEmployees();
		for(Employee e: bigEmps)
		{
			System.out.println(e.getName());
			Frame frame = new Frame(e);
		}
	}
}
