package com.ka.erp;

public class Account {

	int id;
	String name;
	double bal;

	void deposit(double amount) {
		bal = bal + amount;
	}

	void withdrow(double amount) {
		bal = bal - amount;
	}

	void showBalance() {
		System.out.println(name + "'s" + bal);
	}

}
