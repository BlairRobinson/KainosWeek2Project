import Middle.Employee;

public class EmployeeProject {
	
	public static void main(String args[]) {
//		ArrayList<Department> deps = DBConnector.getDepartments();
//		for(Department d: deps)
//		{
//			System.out.println(d.getName());
////			Frame frame = new Frame(d);
//		}
		
		Employee test = new Employee("James", "Smith", "1 Park Inn Way", "234567891", "23432145654", "23-09-89", 40000, 1, 5 );
		DBConnector.addEmployee(test);
	}
}
