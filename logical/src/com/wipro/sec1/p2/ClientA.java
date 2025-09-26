package com.wipro.sec1.p2;

public class ClientA {
	public static void main(String[] args) {

		Client c1 = new Client();
		c1.penCost = 100;
		c1.penSellingCost = 80;
		
		Client c2 = new Client();
		c2.penCost = 2000;
		c2.penSellingCost = 2000;

		if (c1.penSellingCost > c1.penCost) {
			System.out.println("Profit is :   " + (c1.penSellingCost - c1.penCost));
		} else if (c1.penCost > c1.penSellingCost) {
			System.out.println("Loss is :  " + (c1.penCost - c1.penSellingCost));
		} else {
			System.out.println("No Profit No Loss");
		}
		
		System.out.println("-------------------------------");

		if (c2.penSellingCost > c2.penCost ) {
			System.out.println("Profit is : " + (c2.penSellingCost - c2.penCost));
		}
		else if (c2.penCost > c2.penSellingCost) {
			System.out.println("Loss is : " + (c2.penCost - c2.penSellingCost));
		}
		else {
			System.out.println("No Profit No Loss . . . !");
		}
		
		// System.out.println(c1.penCost + c1.penSellingCost);
	}
}
