import java.util.ArrayList;

import Middle.Department;
import Middle.Employee;
import view.Frame;

public class EmployeeProject {
	
	public static void main(String args[]) {
		ArrayList<Department> deps = DBConnector.getDepartments();
		for(Department d: deps)
		{
			System.out.println(d.getName());
//			Frame frame = new Frame(d);
		}
	}
}
