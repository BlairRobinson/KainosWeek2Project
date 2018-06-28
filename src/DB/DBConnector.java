package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Middle.Department;
import Middle.Employee;
import Middle.salesEmployee;

public class DBConnector {

	private static Connection c;

	private static Connection getConnection() {
		String user;
		String password;
		String host;
		Connection c;
		try {
			//Class.forName("com.mysql.jdbc.Driver");

			user 		= "Tom";
			password 	= "TomPassword!";
			host	 	= "localhost";

			if (user == null || password == null || host == null)
				throw new IllegalArgumentException(
						"Properties file must exist and must contain user, password, and host properties.");
			c = DriverManager.getConnection("jdbc:mysql://" + host + "/company?useSSL=false", user, password);
			return c;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<Employee> getEmployees() {

		if (c == null) {
			c = getConnection();
		}
		ArrayList<Employee> emps = new ArrayList<Employee>();
		try {
			Statement s = c.createStatement();
			ResultSet rows = s.executeQuery(
					"SELECT * from employee");
			while (rows.next()) {
				emps.add(new Employee( rows.getString("fname"),
						rows.getString("lname"),
						rows.getString("address"), 
						rows.getString("nin"), 
						rows.getString("account_number"), 
						rows.getString("sort_code"), 
						rows.getFloat("starting_salary"), 
						rows.getInt("department_id"),
						rows.getInt("employee_id")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return emps;

	}
	

	public static ArrayList<salesEmployee> getSalesEmployees() {

		if (c == null) {
			c = getConnection();
		}
		ArrayList<salesEmployee> emps = new ArrayList<salesEmployee>();
		try {
			Statement s = c.createStatement();
			ResultSet rows = s.executeQuery(
					"SELECT * from sales_employees");
			while (rows.next()) {
				emps.add(new salesEmployee( rows.getString("fname"),
						rows.getString("lname"),
						rows.getString("address"), 
						rows.getString("nin"), 
						rows.getString("account_number"), 
						rows.getString("sort_code"), 
						rows.getFloat("starting_salary"), 
						rows.getInt("department_id"),
						rows.getInt("employee_id"),
						rows.getInt("commissionRate"),
						rows.getInt("totalSales")
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return emps;

	}
	
	public static ArrayList<Department> getDepartments() {
		
		if (c == null) {
			c = getConnection();
		}
		ArrayList<Department> deps = new ArrayList<Department>();
		ArrayList<Employee> emps1 = new ArrayList<Employee>();
		ArrayList<Employee> emps2 = new ArrayList<Employee>();
		ArrayList<Employee> emps3 = new ArrayList<Employee>();
	
			try {
				Statement s = c.createStatement();
				ResultSet rows = s.executeQuery(
						"SELECT * from employee WHERE department_id = 1");
				while (rows.next()) {
					emps1.add(new Employee( rows.getString("fname"),
							rows.getString("lname"),
							rows.getString("address"), 
							rows.getString("nin"), 
							rows.getString("account_number"), 
							rows.getString("sort_code"), 
							rows.getFloat("starting_salary"), 
							rows.getInt("department_id"),
							rows.getInt("employee_id")
							));
				}
				
				Department finance = new Department("Finance", emps1);
				deps.add(finance);
				rows=s.executeQuery("SELECT * from employee WHERE department_id = 2");
				
				while (rows.next()) {
					emps2.add(new Employee( rows.getString("fname"),
							rows.getString("lname"),
							rows.getString("address"), 
							rows.getString("nin"), 
							rows.getString("account_number"), 
							rows.getString("sort_code"), 
							rows.getFloat("starting_salary"), 
							rows.getInt("department_id"),
							rows.getInt("employee_id")
							));
				}
				
				Department sales = new Department("Sales", emps2);
				deps.add(sales);
				
				rows=s.executeQuery("SELECT * from employee WHERE department_id = 3");
				
				while (rows.next()) {
					emps3.add(new Employee( rows.getString("fname"),
							rows.getString("lname"),
							rows.getString("address"), 
							rows.getString("nin"), 
							rows.getString("account_number"), 
							rows.getString("sort_code"), 
							rows.getFloat("starting_salary"), 
							rows.getInt("department_id"),
							rows.getInt("employee_id")
							));
				}
				
				Department hr = new Department("Human Resource", emps3);
				deps.add(hr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return deps;
	}
	
	public static void addEmployee(Employee emp) {
		if (c == null) {
			c = getConnection();
		}
		String query = "insert into employee (fname, lname, address, nin, account_number, sort_code, starting_salary, department_id)"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement prep = c.prepareStatement(query);
			prep.setString(1, emp.getFname());
			prep.setString(2, emp.getLname());
			prep.setString(3, emp.getAddress());
			prep.setString(4, emp.getNIN());
			prep.setString(5, emp.getBankNumber());
			prep.setString(6, emp.getSortCode());
			prep.setFloat(7, emp.getStartingSalary());
			prep.setInt(8, emp.getDepartmentNumber());
			
			prep.execute();
			System.out.println("Successfully added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Errror adding employee");
		}
		
		
	}
}

