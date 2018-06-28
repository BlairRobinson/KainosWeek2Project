package Middle;

public class Employee {
	
	protected String fname;
	protected String lname;
	protected String address;
	protected String nIN;
	protected String bankNumber;
	protected String sortCode;
	protected float startingSalary;
	protected int departmentNumber;
	protected int employeeNumber;


	
	public Employee(String fname, String lname, String address, String nIN, String bankNumber, String sortCode, float startingSalary,int departmentNumber, int employeeNumber) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.nIN = nIN;
		this.bankNumber = bankNumber;
		this.sortCode = sortCode;
		this.startingSalary = startingSalary;
		this.departmentNumber = departmentNumber;
		this.employeeNumber = employeeNumber;
	}
	
	
	
	public String getAddress() {
		return address;
	}
	
	public String getNIN() {
		return nIN;
	}
	
	public String getBankNumber() {
		return bankNumber;
	}
	
	public String getSortCode() {
		return sortCode;
	}
	
	public float getStartingSalary() {
		return startingSalary;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	
	
	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public void setNIN(String newNIN) {
		nIN = newNIN;
	}
	
	public void setBankNumber(String newBankNumber) {
		bankNumber = newBankNumber;
	}
	
	public void setSortCode(String newSortCode) {
		sortCode = newSortCode;
	}
	
	public void setStartingSalary(float newStartingSalary) {
		startingSalary = newStartingSalary;
	}
	
	public void setEmployeeNumber(int newEmployeeNumber) {
		employeeNumber = newEmployeeNumber;
	}



	public int getDepartmentNumber() {
		return departmentNumber;
	}



	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
}
