/* The main class is created here with 5 attributes relating to an employee. the constructor is then created in order to 
 * take the values into the class. The getters and setters are set as well as the tostring function and the calculate pay
 * 
 */
package com.lab3;

public class Employee {
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	public Employee(String firstName,String surName,int staffNumber,double annualSalary) {
		this.firstName=firstName;
		this.surName=surName;
		this.staffNumber=staffNumber;
		this.annualSalary=annualSalary;
	}
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public double calculatePay() {
		//calculates the payment every month
		return this.annualSalary/12;
	}
	
	public String toString() {
		//returns the string below
		return "Employee name is "+this.firstName+" "+this.surName+", Staff number is "+this.staffNumber+
				" and has a salary of "+this.annualSalary;
	}
	
	
	
}
