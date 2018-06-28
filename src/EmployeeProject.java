import Middle.Department;
import Middle.Employee;

public class EmployeeProject {

	public EmployeeProject() {
		Employee e = new Employee("Name", "Address", "12345678C", "01928384", "237845", 28000f, 10);
		
		Department d = new Department("Test Department");
		d.addEmployee(e);
		
		System.out.println(d.getEmployees());
	}
	
	public static void main(String args[]) {
		new EmployeeProject();
	}
}
