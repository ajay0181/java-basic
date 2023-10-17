package com.training.adi;

public class student {
	private String studentName;
	private int rollNo;
	private int Class;
	private String fatherName;
	public student(String studentName,int rollNo,int Class,String fatherName) {
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.Class = Class;
	}
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public int getRollNo() {
//		return rollNo;
//	}
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//	
//	public String getFatherName() {
//		return fatherName;
//	}
//	public void setFatherName(String fatherName) {
//		this.fatherName = fatherName;
//	}
	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", rollNo=" + rollNo + ", Class=" + Class + ", fatherName="
				+ fatherName + "]";
	}
	
	
	
		
}
