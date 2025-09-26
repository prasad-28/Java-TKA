package com.ka.erp;

public class Demo {
	public static void main(String[] args) {

		Account a1 = new Account();
		Account a2 = new Account();

		a1.id = 101;a1.name = "Ramesh";a1.bal = 12000;
		a2.id = 201;a2.name = "Neha";a2.bal = 22000;
		
		a1.deposit(3000);
		a2.deposit(3000);
		a1.withdrow(5000);
		a2.withdrow(4000);
		
		System.out.println(a1.id+" "+a1.name+" "+a1.bal );
		System.out.println(a2.id+" "+a2.name+" "+a2.bal );
	}
}
