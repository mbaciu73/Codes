package com.lab4;
//this is for a current account which allows money to be taken out if sufficient funds is available
public class CurrentAccount extends Account {
	private double penaltyAmount;


	
	public CurrentAccount(String accountName, String sortCode, String branchName, boolean inCredit,
			double acctBalance) {
		
		super(accountName, sortCode, branchName, inCredit, acctBalance);
		
	}
	//there must be enough money inside the account in order for a withdraw to be done
	public void withdraw(double takeAmount) {
		if(getAcctBalance()-takeAmount<0) {
			System.out.println("Insufficient Funds");
		}
		else {
			setAcctBalance(getAcctBalance()-takeAmount);
		}
	}
	//this checks if sufficient funds is in the account
	public String checkCredit() {
		if(getAcctBalance()<0) {
			return "Your account balance is below zero";
		}
		return "Your account balance is above zero";
	}
	//if a warning message is entered it will return the message if there is less than 100 in the account
	public String checkCredit(String warningmessage) {
		if(getAcctBalance()<100 && getAcctBalance()>0) 
		{
			return warningmessage;
		}
		return "Your balance is fine";
	}
	//returns the super string and the penalty amount too
	public String toString() {
		return super.toString()+" and the penalty amount is "+penaltyAmount;
	}
}
