package com.wipro.sec1.p1;

import java.util.Scanner;

public class Student3 {
	public static void main(String[] args) {
	
		Scanner Scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");

		int a = Scanner.nextInt();

		System.out.print("Enter second integer: ");

		int b = Scanner.nextInt();

		int sum = a + b;

		System.out.println("Sum: " + sum);
		
		System.out.println("enter Value of C :  ");
		int c = Scanner.nextInt();
		
		System.out.println("enter Vakue of D");
		 int d = Scanner.nextInt();
		 
		int min = c - d;

		System.out.println("Min: " + min);

		Scanner.close();
	}

}
