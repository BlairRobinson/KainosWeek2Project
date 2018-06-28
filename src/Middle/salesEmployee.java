package Middle;

public class salesEmployee extends Employee implements employeeInterface{
	
	public float commissionRate;
	public float salesTotal;


	public salesEmployee(String fname, String lname, String address, String nIN, String bankNumber, String sortCode,
			float startingSalary, int departmentNumber, int employeeNumber) {
		super(fname, lname, address, nIN, bankNumber, sortCode, startingSalary, departmentNumber, employeeNumber);
		// TODO Auto-generated constructor stub
	}



	public salesEmployee(String fname, String lname, String address, String nIN, String bankNumber, String sortCode,
			float startingSalary, int departmentNumber, int employeeNumber, float commissionRate, float salesTotal) {
		super(fname, lname, address, nIN, bankNumber, sortCode, startingSalary, departmentNumber, employeeNumber);
		this.commissionRate = commissionRate;
		this.salesTotal = salesTotal;
	}




	public float getStartingSalary() {
		return startingSalary * (salesTotal * commissionRate);
	}



	public float getCommissionRate() {
		return commissionRate;
	}



	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}



	public float getSalesTotal() {
		return salesTotal;
	}



	public void setSalesTotal(float salesTotal) {
		this.salesTotal = salesTotal;
	}
	
	

}
