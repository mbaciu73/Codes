/* This specific class inherits from the super class Employee. 2 new attributes are created here to determine the new payment
 * scheme which is the hour by the rate. Then the super tostring function is called along adding the new figures which were entered here.
 * 
 */
package com.lab3;

public class hourlyEmployee extends Employee{
	private double hoursWorked;
	private double hourlyRate;

	public hourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary,double hoursWorked,double hourlyRate) {
		super(firstName, surName, staffNumber, 0);
		this.hoursWorked = hoursWorked;
		this.hourlyRate=hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	//getters and setters
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double calculatePay() {
		double empHour = this.hoursWorked*this.hourlyRate;
		return empHour;
		
	}
	
	public String toString() {
		//returns from employee and the hours worked and rate
		return super.toString() +" the hours worked is "+this.hoursWorked+" and the rate is "+this.hourlyRate;
				
	}

}
