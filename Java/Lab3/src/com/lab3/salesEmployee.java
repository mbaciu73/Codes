/*this is the same as Employee other than comission being added and increasing the payment in order of the comission value
 * 
 */
package com.lab3;

public class salesEmployee extends Employee {
	private double comission;
	
	public salesEmployee(String firstName, String surName, int staffNumber, double annualSalary,double comission) {
		super(firstName, surName, staffNumber, annualSalary);
		this.comission=comission;
	}
	//getters and setters
	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}

	public double calculatePay() {
		//adds the comission from the emplyee calculate pay function
		return super.calculatePay() + this.comission;
	}
	
	public String toString() {
		//returns from the employee class and also include comission
		return super.toString()+" and the comission is "+this.comission;
		
	}
	
	

}
