package com.ka.hello;

public class BankBal {
	public static void main(String[] args) {

		String CustomerName = "Ram Deshmukh";
		long customerAccount = 4545454545l;
		String CustomerDob = "15/08/1990";
		double accountBalance = 5000;

		System.out.println("Customer Name: " + CustomerName);
		System.out.println("--------------------------------");

		System.out.println("Customer Account N0. : " + customerAccount);
		System.out.println("--------------------------------");

		System.out.println("Customer Date of Birth: " + CustomerDob);
		System.out.println("--------------------------------");
		
	

		// System.out.println(isMinBal);

		if (accountBalance <= 0) {
			System.out.println("Alert: Insufficient Balance");
		} else if (accountBalance < 5000) {
			System.out.println("Please maintain a minimum balance of 5000");
		} else {
			System.out.println("Your Bank Balance Is: " + accountBalance);
		}
		
		System.out.println("--------------------------------");
		System.out.println("Thank You Have Great Date");

	}

}
