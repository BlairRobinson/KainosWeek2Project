package Middle;

public class Employee {
	
	protected String name;
	protected String address;
	protected String nIN;
	protected String bankNumber;
	protected String sortCode;
	protected float startingSalary;
	protected int employeeNumber;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, String nIN, String bankNumber, String sortCode, float startingSalary, int employeeNumber) {
		this();
		this.name = name;
		this.address = address;
		this.nIN = nIN;
		this.bankNumber = bankNumber;
		this.sortCode = sortCode;
		this.startingSalary = startingSalary;
		this.employeeNumber = employeeNumber;
	}
	
	public String getName() {
		return name;
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
	
	public void setName(String newName) {
		name = newName;
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
}
