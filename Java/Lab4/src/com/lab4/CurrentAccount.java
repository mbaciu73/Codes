package com.lab4;

public class CurrentAccount extends Account {
	private double penaltyAmount;


	
	public CurrentAccount(String accountName, String sortCode, String branchName, boolean inCredit,
			double acctBalance) {
		
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		
	}
	
	
	public void withdraw(double takeAmount) {
		if(getAcctBalance()-takeAmount<0) {
			System.out.println("Insufficient Funds");
		}
		else {
			setAcctBalance(getAcctBalance()-takeAmount);
		}
	}
	public String checkCredit() {
		if(getAcctBalance()<0) {
			return "Your account balance is below zero";
		}
		return "Your account balance is above zero";
	}
	
	public String checkCredit(String warningmessage) {
		if(getAcctBalance()<100 && getAcctBalance()>0) 
		{
			return warningmessage;
		}
		return "Your balance is fine";
	}
	public String toString() {
		return super.toString()+" and the penalty amount is "+penaltyAmount;
	}
}
