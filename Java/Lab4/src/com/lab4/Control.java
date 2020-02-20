package com.lab4;

public class Control {
	public static void main(String[] args) {
		Account a1 = new Account("Current","Aib564","AIB",true,1000);
		DepositAccount d1 = new DepositAccount("Deposit","Boi7876","BOI",true,2500,5);
		CurrentAccount c1 = new CurrentAccount("Account","Kbc8769","KBC",false,5000);
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(c1);
		
		a1.withdraw(55);
		
		System.out.println(a1);
		
		d1.getDetails();
		
		
		
	}

}
