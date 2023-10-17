package com.training.adi;


public class permanent_employee extends employee {
	double pf_amount ,net_salary,pf_percentage;

	public permanent_employee(int empId,String empName,String deptName,double salary,double pf_percentage)
	{
		super(empId,empName,deptName,salary);
		this.pf_percentage = pf_percentage;
		pf_amount = (pf_percentage/100)*salary;
		
		
	}
	 public double calculate_netsalary() {
		 net_salary = salary - pf_amount;
		 return net_salary ;
		 
	 }
	 void display() {
		 System.out.println(net_salary);
	 }
	public static void main(String args[]) {
		
		permanent_employee pm = new permanent_employee(102,"vijay","it",80000,12);
		pm.calculate_netsalary();
		pm.display();
		
	}



}
