package com.lab4;
/*this is the main class where all the numbers are stored. It includes a valid constructor and displays which number you are in terms
of order
*/
public class Account {
	private String accountName;
	private int accountNumber;
	private String sortCode,branchName;
	private boolean inCredit;
	private double acctBalance;
	private static int currentNumber=500;
	
	public Account(String accountName,String sortCode,String branchName,boolean inCredit,double acctBalance) {
		this.accountName=accountName;
		this.accountNumber=nextNumber();
		this.sortCode=sortCode;
		this.branchName=branchName;
		this.inCredit=inCredit;
		this.acctBalance=acctBalance;
	}
	//getters and setters
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean isInCredit() {
		return inCredit;
	}
	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	public static int getCurrentNumber() {
		return currentNumber;
	}
	public static void setCurrentNumber(int currentNumber) {
		Account.currentNumber = currentNumber;
	}
	//if money wants to be added it can be done so
	public void deposit(double depAmount) {
		setAcctBalance(depAmount+this.acctBalance);
	}
	//the account balance must be over zero in order for credit to not be set
	public void withdraw(double takeAmount) {
		setAcctBalance(this.acctBalance-takeAmount);
		
		if(this.acctBalance<0) {
			setInCredit(false);
		}
		else {
			setInCredit(true);
		}
	}
	//these display the small details from the interface validateclass
	public void getDetails() {
		System.out.println("Account name is "+this.accountName+" and the balance is "+ this.acctBalance);
	}
	public void valuableAccount() {
		System.out.println("The Account balance is "+this.acctBalance);
	}
	//mains string
	public String toString() {
		return "This is the "+accountName+"  number "+accountNumber+", sort code is "+sortCode+" in the "+branchName+" branch, the account credit is "+inCredit+
				" and the balance is "+acctBalance+ " and the current number is "+currentNumber;
	}
	//increment of the current number
	public int nextNumber() {
		currentNumber++;
		return currentNumber;
	}
	

}
