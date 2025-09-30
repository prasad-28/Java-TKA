package com.wipro.sec1.p3;

public class ClientA {
	public static void main(String[] args) {
		Account a1 = new Account(10, 20, 30);
		Account a2 = new Account();
		a2.setA(20);
		a2.setB(30);
		a2.setC(77);
		
		System.out.println("Avarage is :  "+a1.calcAvg());
		System.out.println("Avarage is :  "+a2.calcAvg());
	}

}
