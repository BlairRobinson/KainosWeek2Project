import java.util.ArrayList;

import DB.DBConnector;
import Middle.Department;
import Middle.Employee;
import view.Frame;

public class EmployeeProject {

	ArrayList<Department> departments = new ArrayList<>();
	
	public EmployeeProject() {
		Employee e = new Employee("FName", "LName", "Address", "12345678C", "01928384", "237845", 28000f, 2, 10);
		
		Department d = new Department("Test Department");
		d.addEmployee(e);
		
		departments.add(d);
		
		Frame frame = new Frame(departments);
	}
	
	public ArrayList<Department> getDepartments(){
		return departments;
	}
	
	public static void main(String args[]) {
		new EmployeeProject();
		ArrayList<Employee> bigEmps = DBConnector.getEmployees();
		for(Employee e: bigEmps)
		{
			//System.out.println(e.getFName());
		}
	}
}
