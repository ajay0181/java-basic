package com.training.adi;

public class employee {
	private String empName;
	private int empId;
	String deptName;
	 double salary;
	
	public employee() {
		System.out.println("called me");
		
	}
	public employee(int empId,String empName,String deptName,double salary) {
		this.empId = empId;
		this.deptName = deptName;
		this.empName = empName;
		this.salary= salary;
	}
	 public double calculate_netsalary() {
		 return salary ;
	 }
	
//	@Override
//	public String toString() {
//		return "employee [empName=" + empName + ", empId=" + empId + ", deptName=" + deptName + ", salary=" + salary
//				+ "]";
//	}
//	
	public void setEmpName(String empName)
	{
		
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
//	
}
