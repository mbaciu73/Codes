package com.lab4;

public final class DepositAccount extends Account {
	private double interestRate;
	

	

	public DepositAccount(String accountName, String sortCode, String branchName, boolean inCredit,
			double acctBalance,double interestRate) {
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		this.interestRate=interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void withdraw(double takeAmount) {
		System.out.println("You cannot withdraw from a deposit account");
	}
	
	public String toString() {
		return super.toString()+" and the interest rate is "+interestRate;
	}
}
