package com.lab4;
//this class allows for a deposit accont which does not allow withdrawals and includes interest for the account
public final class DepositAccount extends Account {
	private double interestRate;
	
	//constructor
	public DepositAccount(String accountName, String sortCode, String branchName, boolean inCredit,
			double acctBalance,double interestRate) {
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		this.interestRate=interestRate;
	}
	//getter and setter
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//no money is allowed to be taken out
	public void withdraw(double takeAmount) {
		System.out.println("You cannot withdraw from a deposit account");
	}
	//returns the super string and the interest rate
	public String toString() {
		return super.toString()+" and the interest rate is "+interestRate;
	}
}
