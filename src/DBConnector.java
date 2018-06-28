

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import Middle.Employee;

public class DBConnector {

	private static Connection c;

	private static Connection getConnection() {
		String user;
		String password;
		String host;
		Connection c;
		try {
			//Class.forName("com.mysql.jdbc.Driver");

			Properties props = new Properties();
			props.load(new FileInputStream("employeesdb.properties"));

			user 		= "peter";
			password 	= "password";
			host	 	= "localhost";

			if (user == null || password == null || host == null)
				throw new IllegalArgumentException(
						"Properties file must exist and must contain user, password, and host properties.");

			c = DriverManager.getConnection("jdbc:mysql://" + host + "/employees?useSSL=false", user, password);
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
					"SELECT fname AS `name` from employee");
			while (rows.next()) {
				emps.add(new Employee(rows.getString("name")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return emps;

	}
}

